% 2.2 quadratic spline yontemi
%   4 noktamiz olsun: P1, P2, P3, P4
%
%   P1(x1,y1) --- P2(x2,y2) --- P3(x3,y3) --- P4(x4,y4) birlestirirsek ve
%   
%   P1 ve P2 noktalar?n? f1=ax^2+bx+c denklemi ile
%   P2 ve P3 noktalar?n? f2=dx^2+ex+f denklemi ile
%   P3 ve P4 noktalar?n? f3=gx^2+hx+i denklemi ile
%   birlestirirsek
%   ortaya 6 tane denklem cikacaktir
%   ax1^2 + bx1 + c = y1
%   ax2^2 + bx2 + c = y2
%   dx2^2 + ex2 + f = y2
%   dx3^2 + ex3 + f = y3
%   ex3^2 + hx3 + i = y3
%   ex4^2 + hx4 + i = y4
%
%   f1'=f2', f2'=f3' ve f1''=f3'' denkliklerden
%
%   2*ax2+b-2*dx2-e=0, P2 noktas?ndaki turevi
%   2*dx3+e-2*gx3-h=0, P3 noktas?ndaki turevi
%   2a=0 veya 2g=0, uc noktalarda 2.turevi 0'dir
close all ; clear all ; clc ;

x = [1 2 3 4]
y = [0 0.6931 1.0986 1.3863]

number_of_points = length(y);
number_of_lines = number_of_points -1;
number_of_equations = number_of_lines*3;

A = zeros(number_of_equations);
b = zeros(number_of_equations,1);

% 6 satiri linear splinedaki gibi olusturuyoruz
row = 1;
col = 1;
for i = 1:number_of_lines
    A(row:row+1,col:col+2) = [x(i)^2 x(i) 1 ; x(i+1)^2 x(i+1) 1];
    b(row:row+1,1) = [y(i) ; y(i+1)];
    row = row + 2;
    col = col + 3;
end

% 7 ve 8 sat?rlar
col = 1;
for i = 1:number_of_lines-1
    A(row,col:col+5) = [2*x(i+1) 1 0 -2*x(i+1) -1 0];
    row = row + 1;
    col = col + 3;
end

% 9.sat?r
col = 1;
A(row,col:col+2) = [2 0 0];

a = inv(A)*b;

xx = [];
yy = [];

row = 1;
for i = 1:number_of_lines
    tmp_x = x(i):0.1:x(i+1);
    xx = [xx tmp_x];
    tmp_y = 0;
    for j = 0:2
        tmp_y = tmp_y + a(row+j) * (tmp_x.^(2-j));
    end
    yy = [yy tmp_y];
    row = row + 3;
end

plot(xx, yy, 'b', x, y, 'r*');
title('Quadratic spline method');
legend('Bulunan', 'Bilinen', 'Location', 'northwest');
xlabel('x');
ylabel('y');
text(x(1)+0.01,y(1)+0.1, 'P1');
text(x(2)-0.05,y(2)+0.05, 'P2');
text(x(3),y(3)+0.05, 'P3');
text(x(4)+0.05,y(4), 'P4');
grid;