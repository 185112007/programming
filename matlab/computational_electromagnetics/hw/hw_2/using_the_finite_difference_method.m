% Example 3.6
%
% Calculate Zo for the microstrip transmissioon line in Figure 3.14 with
%
%               a=b=2.5cm,   d=0.5cm,   w=1cm
%                   t=0.001cm,   e1=e0,   e2=2.35*e0

% Solution:

% This problem is representative of the various type of problems that can
% be solved using the concepts developed in Section 3.71. The computer
% program in Figure 3.21 was developed based on the five-step procedure
% outlined above. By specifying the step size h and the number of
% iterations, the program first sets the potential at all nodes equal to
% zero. The potential on the outer conductor is set equal to zero, while
% that on the inner conductor is set to 100V so that Vd=100. The program
% finds Co when the dielectric slab is removed and C when the slab is in
% place and finally determines Zo. For a selected h, the number of
% iterations must be large enough and greater than the number of divisions
% along x or y direction. Table 3.7 shows typical result.

% Using the finite difference method
% This program calculates the characteristic impedance of the transmission
% line shows in Figure 3.14.

% Close all figures, clear variables in memory and MATLAB command screen
close all ; clear all ; clc ;

% Set the output format to the short format with compact line spacing
format compact ; format short g;

% Output:
%
% H              NT             Zo
% ------------------------------------
% 0.25          700             69.77
%  0.1          500             65.75
% 0.05          500             70.53
% 0.05          700             67.36
% 0.05         1000             65.50

H = 0.05;
NT = 1000;

A = 2.5; B = 2.5; D = 0.5; W = 1.0;

ER = 2.35;
E0 = 8.81E-12; % sabit
U = 3.0E+8; % phase velocity, Uo=C=3.0E+8

NX = A/H;
NY = B/H;
ND = D/H;
NW = W/H;
VD = 100.0;

% Calculate charge with and without dielectric
ERR = 1.0;
for L=1:2
    E1 = E0;
    E2 = E0*ERR;
    
    % Initialization
    V = zeros(NX+2,NY+2);
    
    % Set potential on inner conductor (fixed nodes) equal to VD
    V(2:NW+1, ND+2) = VD;
    
    % Calculate potential at free nodes
    P1 = E1/(2*(E1+E2));
    P2 = E2/(2*(E1+E2));
    for K=1:NT
        for I=0:NX-1
            for J=0:NY-1
                if ((J==ND)&&(I<=NW))
                    % do nothind
                elseif(J==ND)
                    % Impose boundary condition at the interface
                    V(I+2,J+2) = 0.25*(V(I+3,J+2)+V(I+1,J+2))+ P1*V(I+2,J+3)+P2*V(I+2,J+1);
                elseif (I==0)
                    % Impose symmetry condition along Y-axis
                    V(I+2,J+2) = (2*V(I+3,J+2)+V(I+2,J+3)+V(I+2,J+1))/4.0;
                elseif(J==0)
                    % Impose symmetry condition along X-axis
                    V(I+2,J+2) = (V(I+3,J+2)+V(I+1,J+2)+2*V(I+2,J+3))/4.0;
                else
                    V(I+2,J+2) = (V(I+3,J+2)+V(I+1,J+2)+V(I+2,J+3)+V(I+2,J+1))/4.0;
                end
            end
        end
        % Animation of calculation
        % figure(1),imagesc(V),colorbar,title(num2str(K),'/',num2str(NT))
        % drawnow
    end
    
    % Now, calculate the total charge enclosed in A
    % rectangular path surrounding the inner conductor
    
    IOUT = round((NX+NW)/2);
    JOUT = round((NY+ND)/2);
    
    % Sum potential on inner and outer loops
    
    for K=1:2
        SUM = E1*sum(V(3:IOUT+1,JOUT+2))+E1*V(2,JOUT+2)/2+E2*V(IOUT+2,2)/2;
        for J=1:JOUT-1
            if (J<ND)
                SUM = SUM + E2*V(IOUT+2,J+2);
            elseif (J==ND)
                SUM = SUM + (E1+E2)*V(IOUT+2,J+2)/2;
            else
                SUM = SUM + E1*V(IOUT+2,J+2);
            end
        end
        if K==1
            SV(1) = SUM;
        end
        IOUT = IOUT-1;
        JOUT = JOUT-1;
    end
    SUM = SUM+2.0*E1*V(IOUT+2,JOUT+2);
    SV(2) = SUM;
    Q(L)= abs(SV(1)-SV(2));
    ERR = ER;
end

% Finally calculate Zo
C0 = 4.0*Q(1)/VD;
C1 = 4.0*Q(2)/VD;
Z0 = 1.0/(U*sqrt(C0*C1));

disp([H,NT,Z0])