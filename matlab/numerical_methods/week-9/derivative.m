%       TUREV
%--------------------------
%
%   f'(x) = lim ((deltaF(x))/(deltaX)) 
%
%   f'(x) = (f(xi+deltaX)-f(xi))/(deltaX)
%
%   1. Geri farklar:
%
%       f'{x(i)} = [ f{x(i)}-f{x(i-1}] )/[x(i)-x(i-1)]
%
%   2. Ileri farklar:
%
%       f'{x(i)} = [f{x(i)}-f{x(i+1)}]/[x(i)-x(i+1)]
%   
%   3. Merkezi farklar:
%   
%       f'{x(i)} = [f{x(i-1)-f{x(i+1)}}]/[x(i-1)-x(i+1)]

%   ex: f(x) = x^3, h = 0.1 icin => f'(x) = ?
close all ; clear all ; clc ;

h = 0.1;
x = [-10:h:10];
n = length(x);
y = x.^3;


% j=1;
% for i=2:n-1
%    F(j) = (y(i+1)-y(i-1))/(x(i+1)-x(i-1));
%    j=j+1;
% end
% 
% ygercek = 3*x.^2;
% xx=x;
% xx(n)=[];
% xx(1)=[];
% plot(xx, F, 'k', x, ygercek, 'r-');
% title('Merkezi Farklar');
% legend('Bulunan', 'Bilinen');
% xlabel('x');
% ylabel('y');
% grid;

% ileri farklar
close all ; clear all ; clc ;

h = 1;
x = [-10:h:10];
n = length(x);
y = x.^3;

yg = 3*x.^2;

% geri farklar
xgeri = [];

for i=2:n
    geri(i-1) = (y(i)-y(i-1))/h;
    xgeri = [xgeri x(i)];
end

% ileri farklar
xileri = [];

for i=1:n-1
    ileri(i) = (y(i+1)-y(i))/h;
    xileri = [xileri x(i)];
end

% ileri farklar
xmerkezi = [];

for i=2:n-1
    merkezi(i-1) = (y(i+1)-y(i-1))/(2*h);
    xmerkezi = [xmerkezi x(i)];
end

plot(x, yg, 'k', xgeri, geri, 'r --', xileri, ileri, 'b --', xmerkezi, merkezi, 'g -*');