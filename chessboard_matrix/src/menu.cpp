#include "menu.h"
#include <iostream>


void menu::show(){
    cout<<endl<<"_____________________________"<<endl;
    cout<<"Welcome to ChessBoard Matrix "<<endl;
    cout<<"_____________________________"<<endl<<endl;
    cout<<"Press any key ..."<<endl<<endl;
    cout<<"1. Set the Matrix "<<endl;
    cout<<"2. Get entry at Index (i, j)"<<endl;
    cout<<"3. Add two Matrices "<<endl;
    cout<<"4. Multiply two Matrices " <<endl;
    cout<<"5. Print the Matrix "<<endl;
    cout<<"6. Clear the Screen"<<endl;
    cout<<"7. Quit the portal"<<endl;

}
void menu::execute(){
    int option ;
    do {
        show();
        cout<<"$>  ";
        cin>>option;
        switch(option){
        case 1:
            setMatrix();
            break;
        case 2:
            getMatrixEntry();
            break;
        case 3:
            addMatrices();
            break;
        case 4:
            multiplyMatrices();
            break;
        case 5:
            matrixPrint();
            break;
        case 6:
            cls();
            break;
        case 7:
            quit();
            break;
        default:
            cout<<"Invalid Input, Try again ! "<<endl;
            break;
        }

    }while (option !=7);

}
void menu::setMatrix(){
    system("cls");
    try{
        cin>>_a;
    }
    catch (Matrix::matrixError e){
        if(e==Matrix::Invalid_size){
            cout<<"The Size is not correct, please try again "<<endl;
        }

    }
}
void menu::getMatrixEntry(){
    system("cls");
    cout<<"Please enter the row and column number of the Entry:"<<endl;
    int row, col;
    cout<<"Row : ";
    cin>>row;
    cout<<"Col : ";
    cin>>col;
    try{
        int entry=_a.getEntry(row, col);
        cout<<"Entry at ("<<row<<","<<col<<") : "<<entry<<endl;
    }
    catch (Matrix::matrixError e){
        if (e==Matrix::Illegal_Argument){
            cout<<"Row or column can not be less then 0"<<endl;

        }
        else if (e == Matrix::IndexOutOfBoundException){
            cout<<"Dimension not correct"<<endl;
        }
    }
}
void menu::addMatrices (){
    system("cls");
    cout<<"Enter the Matrix B to execute addition whereas Matrix A is the current Matrix "<<endl;
    cout<<"Matrix B: "<<endl;
    Matrix b;
    try{
        cin>>b;
    }
    catch (Matrix::matrixError e){
        if(e==Matrix::Invalid_size){
            cout<<"The Size is not correct, please try again "<<endl;
        }

    }

    Matrix c(b.getDimension());
    cout<<"Matrix A"<<endl;
    cout<<_a<<endl;
    cout<<"Matrix B"<<endl;
    cout<<b;
    try{
        c=_a+b;
        cout<<"Addition of Matrix A + Matrix B"<<endl;
        cout<<c<<endl;
    }
    catch (Matrix::matrixError e){
        if (e==Matrix::Different_Size_Exception){
            cout<<"Dimension of both of matrices should be same"<<endl;
        }
    }
}
void menu::multiplyMatrices(){
    system("cls");
    cout<<"Enter the Matrix B to execute Multiplication whereas Matrix A is the current Matrix "<<endl;
    cout<<"Matrix B: "<<endl;
    Matrix b;
    try{
        cin>>b;

    }
    catch (Matrix::matrixError e){

        if(e==Matrix::Invalid_size){
            cout<<"The Size is not correct, please try again "<<endl;
        }
    }
    Matrix c(b.getDimension());
    cout<<"Matrix A"<<endl;
    cout<<_a<<endl;
    cout<<"Matrix B"<<endl;
    cout<<b;
    try{
        c=_a*b;
        cout<<"Multiplication of Matrix A * Matrix B"<<endl;
        cout<<c<<endl;

    }
    catch(Matrix::matrixError e){
        if (e==Matrix::Different_Size_Exception){
            cout<<"Dimension of both of matrices should be same"<<endl;
        }
        else if (e== Matrix::IndexOutOfBoundException){
            cout<<"IndexoutofBound"<<endl;
        }
        else if (e== Matrix:: Illegal_Argument){
            cout<<"Illegal_argument"<<endl;
        }
    }

}
void menu ::matrixPrint(){
    cout<<endl<<_a;
}
void menu::cls(){
    system("cls");
    execute();
}
void menu::quit(){
    system("exit");
}
