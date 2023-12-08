function [n_x, n_y] = trans(x, y, theta)
    mat = [cos(theta) -sin(theta); sin(theta) cos(theta)]; %回転行列
    result = mat*[x; y]; %xとyを回転行列をかけて変換する
    n_x=result(1,1);
    n_y=result(2,1);
end