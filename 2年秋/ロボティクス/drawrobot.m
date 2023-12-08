function drawrobot(x, y, theta)
    point=[0.4, 0.2, -0.2, -0.2, 0.2, -0.2, 0.2, -0.2, 0.2; 0.0, 0.2, 0.2, -0.2, -0.2, 0.3, 0.3, -0.3, -0.3]; %0，0を基準にロボットを描画するための座標を格納する。1列目にはx、2列目にはy座標が格納される

    for i=1:9
        [point(1,i), point(2,i)] = trans(point(1,i), point(2,i), theta); %ロボットの向きに合わせてpointに格納した座標を回転変換する
    end
    
    plot(x+[point(1,1:5),point(1,1)]', y+[point(2,1:5),point(2,1)]', '-r') %赤い線で2点を結ぶ。胴体描画
    hold on
    plot(x+point(1,6:7)', y+point(2,6:7)', '-r') %赤い線で2点を結ぶ。車輪描画
    plot(x+point(1,8:9)', y+point(2,8:9)', '-r') %赤い線で2点を結ぶ。車輪描画
    hold off
end


