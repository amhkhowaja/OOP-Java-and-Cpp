#include "Matrix.h"
#include <iomanip>
using namespace std;

//Constructors

Matrix ::Matrix (const int k ){
    if (k<=0){
        throw Invalid_size;
    }
    _dim=k;
    int s=k%2==0?(k*k/2):(((k*k)+1)/2);
    _matrix.resize(s);
}
Matrix ::Matrix(vector <int> vec) {
    int l= vec.size();
    float r= sqrt(2.0*l);
    float l2= r*r/2;
    if (l==l2){
        _dim=r;
        _matrix = vec ;
    }
    else {
        throw Invalid_size;
    }








}
//Asked Methods:
int Matrix :: getIndex1D (int i, int j){
    if (i<=0 || j<=0){
        throw Illegal_Argument;
    }
    vector <int> matrix = getMatrix();
    int total_columns = getColumn();
    int index;
    int n ;                     //for finding the index in particular row
    int rowxcol= getRow()*getColumn();
    if (i*j > rowxcol){
        throw IndexOutOfBoundException;
    }
    if ((i%2)!=(j%2)){
        return 0;
    }
    else{
        if (i%2==1){
            n = (j+1)/2;            // derived from 2n+1 = j   (for odd)
            index = (((i-1)*(total_columns))/2) + n-1;
        }
        else {
            n = (j)/2;                // for even , derived from j=2n
            index = ((((i-1)*(total_columns))+1)/2) + n-1;
        }

    }
    return index;
}
void Matrix ::setEntryAtIndex(int i, int j, int value){
    if (i<=0 || j<=0){
        throw Illegal_Argument ;

    }
    else {
        if (i%2==j%2){
            int index = getIndex1D(i,j);
            _matrix[index]=value;
        }
        else {

        }
    }

}

int Matrix::getEntry (int i, int j) {            // i=row , and j=column
    if (i<=0 || j<=0){
        throw Illegal_Argument;

    }
    vector <int> matrix = getMatrix();
    int total_columns = getColumn();
    int index;
    int n ;                     //for finding the index in particular row
    int rowxcol= getRow()*getColumn();
    if (i*j > rowxcol){
        throw IndexOutOfBoundException;
    }
    if ((i%2)!=(j%2)){
        return 0;
    }
    else{
        if (i%2==1){
            n = (j+1)/2;            // derived from 2n+1 = j   (for odd)
            index = (((i-1)*(total_columns))/2) + n-1;
        }
        else {
            n = (j)/2;                // for even , derived from j=2n
            index = ((((i-1)*(total_columns))+1)/2) + n-1;
        }

    }
    return matrix[index];
}
//inputing the elements in the matrix
istream& operator>> (istream &in, Matrix& a){
    int length;
    cout<<"Enter the size of the matrix:  ";
    in>>length;
    if (length <=0){
        throw Matrix::Invalid_size;
    }
    else {
        a._matrix.resize(0);
        int value;
        for (int i=1; i<=length ;i++){
            for (int j=1;j<=length ; j++){
                if (i%2==j%2){
                    cout<<"("<<i<<","<<j<<")"<<" : " ;
                    in>>value;
                    a._matrix.push_back(value);
                }
            }
            cout<<endl;
        }


    a._dim=length;
    }
    return in;
}
//printing the matrix
ostream& operator<< (ostream &out, Matrix& a){
    int size=a.getDimension();
    for (int i=1;i<=a.getRow();i++){

        for (int j =1; j<=a.getColumn();j++){
            if (i%2==j%2){
                out<<setw(4)<<a.getEntry(i, j);
            }
            else {
                out<<setw(4)<<0;
            }

        }

        out<<endl;
    }
    return out;
}
Matrix operator+(Matrix& a , Matrix& b){
    int length=a.getMatrix().size();
    vector<int> vec;
    if (length!=b.getMatrix().size()){
        throw Matrix::Different_Size_Exception;
    }
    else {

        for (int i = 0; i <length; i++)
        {
            //cout<<a.getMatrix()[i];
            vec.push_back(a.getMatrix()[i]+b.getMatrix()[i]);
        }

    }
    Matrix c(vec);
    return c;
}
Matrix operator*(Matrix& a ,Matrix& b)
{
    int length = a.getMatrix().size();
    if(length != b.getMatrix().size())
    {
        throw Matrix::Different_Size_Exception;
    }
    else{
        int n = a.getRow();
        Matrix mul(a.getDimension());
        for(int i = 1; i <= n; i++)
        {
           for (int j = 1; j <= n; j++)
           {
               int c = 0;
               for (int k = 1; k <= n; k++)
               {
                   c = c + a.getEntry(i,k)*b.getEntry(k,j);
                    mul.setEntryAtIndex(i,j,c);
               }
           }
        }
        return mul;
    }
}
