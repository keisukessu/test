function [ddth] = control_calc(l1, l2, lg1, lg2, m1, m2, i1, i2, th1, th2, dth1, dth2, g, kp, kv, qd)

    %教科書83ページで求めた2リンクロボットの動力学式のそれぞれの項
    m_mat = [i1+i2+2*m2*l1*lg2*cos(th2)+m2*l1^2, i2+m2*l1*lg2*cos(th2); i2+m2*l1*lg2*cos(th2), i2]; 
    h_vec = [-m2*l1*lg2*sin(th2)*(2*dth1*dth2+dth2^2); m2*l1*lg2*sin(th2)*dth1^2];
    g_vec = [(m1*lg1+m2*l1)*cos(th1)+m2*lg2*cos(th1+th2); m2*lg2*cos(th1+th2)]*g;
    th = [th1; th2];
    dth = [dth1; dth2];
    
    %教科書83ページで求めた2リンクロボットの動力学式からθの2次微分を計算する．
    ddth = -inv(m_mat)*(h_vec+g_vec+kv.*dth+kp.*(th-qd));
end