clc; clear all; close all;

% 1. A matrisin determinantini bul
A = [1 0 2;2 1 0; 3 2 1];
b = [-9; 5; 4];
detA = det(A);

% 2. D matrisleri bulunur
n=length(b);
for i=1:n
   D = A;
   D(:,i) = b; % : - butun satýr elemanlarý, 1 - birinci sutun
   detD = det(D);
   
   % 3. bilinmeyenler bulunur
   x(i,1) = detD/detA;
end
x
