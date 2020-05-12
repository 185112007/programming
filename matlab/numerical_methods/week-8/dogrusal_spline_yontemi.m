% 2.1 dogrusal spline yontemi
%
% ex: 4 noktamiz olsun: P1, P2, P3, P4
%
%   P1(x1,y1) --- P2(x2,y2) --- P3(x3,y3) --- P4(x4,y4) birlestirirsek ve
%   
%   P1 ve P2 aras?ndaki dogruyu f1=ax+b
%   P2 ve P3 aras?ndaki dogruyu f2=cx+d
%   P3 ve P4 aras?ndaki dogruyu f3=ex+f
%   
%   varsayarsak, ortaya 6 tane denklem cikacaktir
%
%   1) f1=ax+b denkleminden
%
%   P1 noktas? icin:    ax1+b=y1
%   P2 noktas? icin:    ax2+b=y2
%
%   2) f2=cx+d denkleminden
%
%   P2 noktas? icin:    cx2+d=y2
%   P3 noktas? icin:    cx3+d=y3
%
%   3) f3=ex+f denkleminden
%
%   P3 noktas? icin:    ex3+f=y3
%   P4 noktasu icin:    ex4+f=y4
%
%   6 tane denklem elde ederiz.
%   NOT: burada dikkat edilmesi gereken, eger nokta say?s? 4 ise 3 dogru
%   elde ederis => eger nokta say?s?n? N dersek, N-1 tane dogru olacakt?r
%   ve (N-1)*2 tane denklem elde edecegiz.
%
close all ; clear all ; clc ;

x = [1 2 3 4]; 
y = [0 0.6931 1.0986 1.3863];

number_of_points = length(y);
number_of_lines = number_of_points -1;
number_of_equations = number_of_lines*2;

A = zeros(number_of_equations);
b = zeros(number_of_equations,1);

row = 1;
col = 1;
for i=1:number_of_lines
    A(row:row+1, col:col+1) = [x(i) 1;x(i+1) 1];
    b(row:row+1,1) = [y(i);y(i+1)];
    
    row = row+2;
    col = col+2;
end

X=A\b;
xx=[];
yy=[];
row = 1;
for i = 1:number_of_lines
    tmp_x = x(i):0.1:x(i+1);
    xx = [xx tmp_x];
    yy = [yy X(row)*tmp_x+X(row+1)];
    row = row + 2;
end

plot(xx, yy, 'b', x, y, 'r*');
title('Linear spline method');
legend('Bulunun', 'Bilinen', 'Location', 'northwest');
xlabel('x');
ylabel('y');
grid;