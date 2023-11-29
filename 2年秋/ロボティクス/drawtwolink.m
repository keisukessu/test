function drawtwolink(q1, q2, l1, l2)
    plot([0, l1*cos(q1)]', [0, l1*sin(q1)]', '-r'); %1番目のリンクの描画（plotはplot(x座標の列ベクトル, y座標の列ベクトル, 線の形と色)である．'は転置を意味し，[だら ,だら ]'は2x1の列ベクトルになる．
    hold on; %これによりここからは描画しても前のモノを消さない．
    plot([l1*cos(q1), l1*cos(q1)+l2*cos(q1+q2)]', [l1*sin(q1), l1*sin(q1)+l2*sin(q1+q2)]', '-g'); %2番目のリンクの描画
end