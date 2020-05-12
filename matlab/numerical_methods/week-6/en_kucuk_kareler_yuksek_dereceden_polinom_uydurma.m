% odev 3, 

% katsayilar = polyfit(x,y,derece) ilgili katsayilar verir
% odevde polyfit kulanilmayacaktir!!!
%
% ornek

% Close all figures, clear variables in memory and MATLAB command screen
close all; clear all; clc;

% Set the output format to the short format with compact line spacing
format short; format compact;

% Specify values and necessary parameters
x = [0 2 5 9 15 25 40];
y = [5 12 23 37 44 60 81];
degree = 10;
% bilinen degerleri icin en uygun besinci dereceden polinomu bulan
% MATLAB kodlarini yaziniz

xdegree = 0;
ydegree = 0;
count = 2;
for i=1:degree+1
    b(i,1)=sum(y.*(x.^(i-1)));
    for j=i:degree+1
        A(i,j)=sum(x.^xdegree);
        A(j,i)=A(i,j);
        xdegree=xdegree+1;
    end
    xdegree=count;
    count=count+2;
end

a=A\b;
fx = 0;
for i=1:degree+1
   fx = fx + a(i)*x.^(i-1); 
end

a1 = polyfit(x,y,degree);
a1=flip(a1);
gx = 0;
for i=1:degree+1
   gx = gx + a1(i)*x.^(i-1); 
end

%fx=a(1)+a(2)*x+ a(3)*(x.^2);
figure;
plot(x,y,'k-o', x, fx,'r-*');
legend('y','fx');
title({'My Solution';'Degree'})

figure;
plot(x,y,'k-o', x, gx,'r-*');
legend('y','gx');
title('Solution With polyfit function')