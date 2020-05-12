% Ogrenci No: 185112007
% Ad Soyad  : Gafur HAYYTBAYEV
 
close all ; clear all ; clc ;

% verilmis fonksyon
%fx = (x^3) + (x^2) - (12 * x);

% fonksyon turevi
%fxd = (3 * x^2) + (2 * x) - 12;

% aralik
a = 2;
b = 4;

% durma kosulu
h = 0.0001;

iter = 0;

while abs(a - b) > h
    fa = (a^3) + (a^2) - (12 * a);
    fb = (b^3) + (b^2) - (12 * b);

    x = (a * fb - b * fa) / (fb - fa);

    fx = (x^3) + (x^2) - (12 * x);

    if (fb * fx) < 0
        a = x;
    end
    
    fbd = (3 * b^2) + (2 * b) - 12;
    
    b = b - fb / fbd;

    iter = iter + 1;
end

fprintf('Yaklasik kok: %f\n', x);
x
fx = (x^3) + (x^2) - (12 * x)
a
b