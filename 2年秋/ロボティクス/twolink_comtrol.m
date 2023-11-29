% 2linkロボットシミュレーション
% 2022.11.15 李周浩
% 実行を中断したいときはctrl+cを押す

%初期値
th1=0; %θ1の初期値
th2=0; %θ2の初期値
dth1=0; %θ1微分の初期値
dth2=0; %θ2微分の初期値
g=9.8; %重力加速度
dt=0.01; %Δtの初期値
max_time=3; %シミュレーション時間

%ロボットのデータ
l1=0.5; %リンク1の長さ
l2=0.4; %リンク2の長さ
i1=5.0; %リンク1の関節1における慣性モーメント
i2=4.0; %リンク2の関節1における慣性モーメント
m1=3.0; %リンク1の重さ
m2=2.0; %リンク2の重さ
lg1=l1/2; %リンク1の重心までの距離
lg2=l2/2; %リンク2の重心までの距離

%制御変数
qd=[5; 1]; %目標位置(角度rad，順番にθ1，θ2)
kp=[10000; 1000]; %比例制御ゲイン(順番にkp1，kp2)
kv=[500; 200]; %微分制御ゲイン(順番にkv1，kv2)

figure; %描画用のウィンドウの用意

cnt = 1; %カウントの初期値

for i=0:dt:max_time

    %制御シミュレーションが終わった後にθ1とθ2の軌跡を描画するためにθ1，θ2，時間をロープごとに列ベクトルに追加する．
    q1(cnt) = th1; %θ1の追加
    q2(cnt) = th2; %θ2の追加
    time(cnt) = i; %時間の追加
    cnt = cnt + 1; %カウントを1つ増やして次の追加に備える．
    
    hold off; %hold offにするとここから何か描画すると画面がクリアされ描画される．
    drawtwolink(th1, th2, l1, l2) %ロボットを描画
    
    axis([-1 1 -1 1]) %1.0x1.0の座標空間を用意
    axis square %縦と横を同じ大きさにする
    pause(0.01) %描画が速くならないように一時的に止める．
    
    %教科書81ページの(5.14)を計算しθの2次微分を求める．
    ddth = control_calc(l1, l2, lg1, lg2, m1, m2, i1, i2, th1, th2, dth1, dth2, g, kp, kv, qd);
    ddth1 = ddth(1);
    ddth2 = ddth(2);
    
    %θの2次微分からθの微分を，θ微分からθを更新する．
    dth1=dth1+ddth1*dt;
    dth2=dth2+ddth2*dt;
    th1=th1+dth1*dt;
    th2=th2+dth2*dt;
end

%θ1の軌跡描画
figure;
plot(time, q1);
ylabel("theta 1");
xlabel("time(sec)");
%θ2の軌跡描画
figure;
plot(time, q2);
ylabel("theta 2");
xlabel("time(sec)");
