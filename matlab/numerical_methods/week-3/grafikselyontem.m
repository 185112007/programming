% x + e^y = 3
% sin(Pi*x/4) + y = 1

x=0:0.1:3;
% 1.ad�m
% her iki denklemin y = ? bul

y1 = log(3-x);
y2 = 1-sin((pi/4).*x);

% 2. ad�m 
% her iki denklemi cizdir

plot(x, y1, 'b', x, y2, 'r');
grid