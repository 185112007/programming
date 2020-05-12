% Interpolasyon Yontemleri
%
% - arada kalan degeri tahmin etme islemi
%
% 0. Lineer Interpolasyon
%
%   - bilmedigimiz degerin sagindaki ve solundaki deger kullanilir
%   - sagi ve solundaki noktalarda bir dogru elde edilir
%   - dogrunun egimi bulunur
%         m=(y(k+1)-y(k-1))/(x(k+1)-x(k-1)) =>
%         y(k)=y(k-1)+m*(x(k)-x(k-1))
%
%    veya y = y0+(y1-y0)*(x-x0)/(x1-x0)


close all ; clear all ; clc ;
% 1) 1 ve 4 kullanarak yi bulmak
x = [1 4 6];
y = [0 1.3862944 1.7917595];

m = (y(2)-y(1))/(x(2)-x(1));
yk = y(1)+m*(2-x(1));

% 2) 1 ve 6 icin yi bulmak
m = (y(3)-y(1))/(x(3)-x(1));
ykk = y(1)+m*(2-x(1));

%
% 1. Lagrange Interpolasyon yontemi
%
%  - bilinen butun noktalarin degeri kulanilir
%  - f(x) = a0 + a1*x + a2*x^2 + ...
%
% veya y = (x-x1)y0/(x0-x1) + (x-x0)y1/(x1-x0)
%
%
close all ; clear all ; clc ;
%x = [0 2 4 7 10]; % 1.ornek
%y = [1 7 10 13 20]; % 1.ornek

x = [1 4 6]; % 2.ornek
y = [0 1.3862944 1.7917595]; % 2.ornek

%X = 3; % 1.ornek
xx = 2; % 2.ornek

n = length(y);
fx = 0;
for i=1:n
    carpma = 1;
    for j=1:n
        if i~=j
            carpma = carpma*(xx-x(j))/(x(i)-x(j));
        end
    end
    fx = fx+ carpma*y(i);
end

% 2. Egrisel/Kübik Yaklasim (Quadratic/Cubic Spline) Yöntemleri
%
%  - Lagrange interpolasyon cogu problem icin calisir 
%    ama bazi problemlerde dogru sonuc vermeyebilir.
%    Bu gibi durumlarda Cubic Spline yontemi kullanilir.