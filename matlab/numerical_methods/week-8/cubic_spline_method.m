% 2.2 Cubic Spline Method
% --------------------------
%
%   4 noktamiz olsun: P1, P2, P3, P4
%
%   P1(x1,y1) --- P2(x2,y2) --- P3(x3,y3) --- P4(x4,y4) birlestirirsek ve
%   
%   P1 ve P2 noktalarini f1=ax^3+bx^2+cx+d denklemi ile
%   P2 ve P3 noktalarini f2=ex^3+fx^2+gx+h denklemi ile
%   P3 ve P4 noktalarini f3=ix^3+jx^2+kx+l denklemi ile
%   birlestirirsek (her denklemde 4 bilinmeyen * 3 = 12 bilinmeyen)
%   yukaridaki 3 denklemden 6 tane denklem yazabiliris:
%
% 1. adim(denklemler P1,P2,P3 ve P4 noktalari dikkate aldigimizda)
% -------
%   1) f1=ax^3+bx^2+cx+d denkleminden:
%
%       ax1^3+bx1^2+cx1+d = y1, bu P1 noktasi icin  (1.denklem)
%       ax2^3+bx2^2+cx2+d = y2, bu P2 noktasi icin  (2.denklem)
%
%   2) f2=ex^3+fx^2+gx+h denkleminden:
%
%       ex2^3+fx2^2+gx2+h = y2, bu P2 noktasi icin  (3.denklem)
%       ex3^3+fx3^2+gx3+h = y3, bu P3 noktasi icin  (4.denklem)
%
%   3) f3=ix^3+jx^2+kx+l denkleminden:
%
%       ix3^3+jx3^2+kx3+l = y3, bu P3 noktasi icin  (5.denklem)
%       ix4^3+jx4^2+kx4+l = y4, bu P4 noktasi icin  (6.denklem)
%
% 2. adim(fonksyonlarin kesistigi ortak noktada 1.turevleri birbirine 
%    esittir): P2 noktasinda f1'=f2' ve P3 noktasinda f2'=f3'
% -------
%   1) P2 noktasi icin f1'=f2'
%
%       3ax2^2+2bx2+c-3ex2^2-2fx2+g=0               (7.denklem)
%       
%   2) P3 noktasi icin f2'=f3'
%
%       3ex3^2+2fx3+g-3ix3^2-2jx3+k=0               (8.denklem)
%
% 3. adim(orta  noktalarin 2.turevleri esittir): f1''=f2'' ve f2''=f3''
%
%   1) P2 noktasi icin f1''=f2''
%
%       6ax2+2b+0-6ex2-2f+0=0                       (9.denklem)
%
%   2) P3 noktasi icin f2''=f3''
%
%       6ex3+2f+0-6ix3-2j+0=0                       (10.denklem)
%
% 4. adim(ilk ve son noktanin 2.turevi sifir): f''(x1)=0 ve f''(x4)=0
%
%   1) P1 noktasi icin
%
%       6ax1+2b=0                                   (11.denklem)
%
%   2) P4 noktasi icin
%
%       6ix4+2j=0                                   (12.denklem)
close all ; clear all ; clc ;

x = [1 2 3 4];
y = [0 0.6931 1.0986 1.3863];

% x = [1 2 3];
% y = [0 0.6931 1.0986];

% x = [1 2];
% y = [0 0.6931];

number_of_points = length(x);
number_of_lines = number_of_points -1;
number_of_equations = number_of_lines*4;

A = zeros(number_of_equations);
b = zeros(number_of_equations,1);

% f1=ax^3+bx^2+cx+d
% f2=ex^3+fx^2+gx+h
% f3=ix^3+jx^2+kx+l
%
% ilk 6 satiri olusturyruz
row = 1;
col = 1;
for i = 1:number_of_lines
    A(row:row+1,col:col+3) = [x(i)^3 x(i)^2 x(i) 1; x(i+1)^3 x(i+1)^2 x(i+1) 1];
    b(row:row+1,1) = [y(i) ; y(i+1)];
    row = row + 2;
    col = col + 4;
end

% P2 noktasinda f1'=f2' ve P3 noktasinda f2'=f3'
% 7 ve 8 satirlar
col = 1;
for i = 1:number_of_lines-1
    A(row,col:col+7) = [3*x(i+1)^2 2*x(i+1) 1 0 -3*x(i+1)^2 -2*x(i+1) -1 0];
    row = row + 1;
    col = col + 4;
end

% f1''=f2'' ve f2''=f3''
% 9 ve 10 satirlar
col = 1;
for i = 1:number_of_lines-1
    A(row,col:col+5) = [6*x(i+1) 2 0 0 -6*x(i+1) -2];
    row = row + 1;
    col = col + 4;
end

% f''(x1)=0 ve f''(x4)=0
% 11 ve 12 satirlar
col = 1;
for i = 1:number_of_points-1:number_of_points
    A(row,col:col+1) = [6*x(i) 2];
    row = row + 1;
    col = col + 8;
end

a = A\b;

xx = [];
yy = [];

row = 1;
for i = 1:number_of_lines
    tmp_x = x(i):0.1:x(i+1);
    xx = [xx tmp_x];
    tmp_y = 0;
    for j = 0:3
        tmp_y = tmp_y + a(row+j) * (tmp_x.^(3-j));
    end
    yy = [yy tmp_y];
    row = row + 4;
end

plot(xx, yy, 'b--', x, y, 'r*');
title('Cubic Spline Method');
legend('Bulunan', 'Bilinen', 'Location', 'northwest');
xlabel('x');
ylabel('y');
grid;