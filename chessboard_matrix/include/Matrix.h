#ifndef MATRIX_H
#define MATRIX_H
#include <vector>
#include <iostream>
#include <cmath>
using namespace std;
class Matrix {
private:
    int _dim;
    vector<int> _matrix;
public :
    //constructors:
    Matrix(){_matrix.clear();}
    Matrix(const vector <int> vec); //overloaded Constructor
    Matrix(const int k);

    //Exceptions
    enum matrixError {Invalid_size,Empty_Matrix_Error,Not_Existing_Element,Different_Size_Exception,Illegal_Argument , IndexOutOfBoundException};

    //Asked Methods
    int getEntry (int i, int j);
    friend Matrix operator+(Matrix& a ,Matrix& b);
    friend Matrix operator*(Matrix& a, Matrix& b);
    friend istream& operator>>(istream &in, Matrix &a);
    friend ostream& operator<< (ostream &out , Matrix &a);

    void print();
    //getter
    vector<int> getMatrix () {return _matrix;}
    int getSize(){return _matrix.size();}
    int getDimension (){ return _dim;}
    int getRow(){return sqrt(_matrix.size()*2);}
    int getColumn(){return sqrt(_matrix.size()*2);}
    int getIndex1D(int, int j);
    //setter
    vector <int> randomGen();
    void setEntryAtIndex (int i, int j, int value);
    void setMatrix (vector <int> vec) ;

};

#endif // MATRIX_H
