% en kucuk kareler yontemi(egri uydurma)
clc; clear all; close all;

x = [0 1 2 4 7];
y = [1 5 8 13 21];

%
%n = length(y);
%A(1,1) = n;
%A(1,2) = sum(x);
%A(2,1) = sum(x);
%A(2,2) = sum(x.^2);

%b(1,1) = sum(y);
%b(2,1) = sum(x.*y);

%a = inv(A)*b;

%fx = a(1)+a(2)*x

%plot(x,y,'k', x, fx,'r-*');
%legend('bilinen','hesaplanan');

degree = 1;
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

a=inv(A)*b;
fx=a(1)+a(2)*x;
plot(x,y,'k', x, fx,'r-*');
legend('bilinen','hesaplanan');