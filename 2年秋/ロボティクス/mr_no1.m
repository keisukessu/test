r_x = 5; %ロボットのx座標
r_y = 5; %ロボットのy座標
r_theta = 0; %ロボットの角度（向き、rad）

figure

drawrobot(r_x, r_y, r_theta) %ロボットを描画

axis([0 10 0 10])
axis square
