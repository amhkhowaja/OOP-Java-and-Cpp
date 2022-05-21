#include<bits/stdc++.h>
#include "menu.h"
#include "Matrix.h"
using namespace std;

//#define NORMAL_MODE
#ifndef NORMAL_MODE

int main()
{
    menu m;
    m.execute();

}
#else
#define CATCH_CONFIG_MAIN
#include "catch.hpp"



//Test cases
TEST_CASE("File Reading Test","in1.txt"){
    const string fname= "in1.txt";
    ifstream fin(fname);
    if(fin.fail()){
        cout<<"File not found!"<<endl;
        exit(1);
    }
    else{
        Matrix a ,b ;
        fin>>a;
        //3 1 2 3 4 5

        //1 0 2
        //0 3 0
        //5 0 5
        CHECK(a.getDimension()==3);
        CHECK (a.getEntry(1,1)==1);
        CHECK (a.getEntry(1,3)==2);
        CHECK (a.getEntry(2,2)==3);
        CHECK (a.getEntry(3,1)==4);
        CHECK (a.getEntry(3,3)==5);

        fin>>b;
        //2 1 2

        //1 0
        //0 2
        CHECK(b.getDimension()==2);
        CHECK (b.getEntry(1,1)==1);
        CHECK (b.getEntry(1,3)==2);
    }

}

TEST_CASE("Getting Entries","Vector"){
    vector <int> vec{1,2,3,4,5};
    Matrix a(vec);                   //instanciating the matrix with vector parameter
    /*const string fname= "in1.txt";
    ifstream fin(fname);
    if(fin.fail()){
        cout<<"File not found!"<<endl;
        exit(1);
    }
    fin>>a;*/

    CHECK (a.getDimension()==3);
    CHECK (a.getEntry(1,1)==1);
    CHECK (a.getEntry(1,3)==2);
    CHECK (a.getEntry(2,2)==3);
    CHECK (a.getEntry(3,1)==4);
    CHECK (a.getEntry(3,3)==5);


    //Setting the Entry manually and checking

    Matrix b(3);        //instanciating another matrix with integer parameter as a dimension

    //2 0 1
    //0 5 0
    //6 0 4
    // Setting the element as per above arrangement
    b.setEntryAtIndex(1,1, 2);
    b.setEntryAtIndex(1,3, 1);
    b.setEntryAtIndex(2,2, 5);
    b.setEntryAtIndex(3,1, 6);
    b.setEntryAtIndex(3,3, 4);

    //checking element whether they can be accessed
    CHECK (b.getDimension()==3);
    CHECK (b.getEntry(1,1)==2);
    CHECK (b.getEntry(1,3)==1);
    CHECK (b.getEntry(2,2)==5);
    CHECK (b.getEntry(3,1)==6);
    CHECK (b.getEntry(3,3)==4);
}

TEST_CASE("Addition of two Matrix", "in2.txt"){
    const string fname= "in2.txt";
    ifstream fin(fname);
    if(fin.fail()){
        cout<<"File not found!"<<endl;
        exit(1);
    }
    else {
       Matrix a, b;
       fin>>a>>b;
       // MATRIX A:
       //1 0 2 0
       //0 3 0 4
       //5 0 6 0
       //0 7 0 8
        // MATRIX B:
       //2 0 3 0
       //0 4 0 5
       //7 0 8 0
       //0 9 0 2

       CHECK(a.getDimension()==b.getDimension());

       //so Matrix addition is parrallel WE ARE CHECKING THE PARALLEL SUMS

       Matrix c=a+b;
       CHECK(c.getEntry(1,1)==a.getEntry(1,1)+b.getEntry(1,1));
       CHECK(c.getEntry(1,3)==a.getEntry(1,3)+b.getEntry(1,3));
       CHECK(c.getEntry(2,2)==a.getEntry(2,2)+b.getEntry(2,2));
       CHECK(c.getEntry(2,4)==a.getEntry(2,4)+b.getEntry(2,4));
       CHECK(c.getEntry(3,1)==a.getEntry(3,1)+b.getEntry(3,1));
       CHECK(c.getEntry(3,3)==a.getEntry(3,3)+b.getEntry(3,3));
       CHECK(c.getEntry(4,2)==a.getEntry(4,2)+b.getEntry(4,2));
       CHECK(c.getEntry(4,4)==a.getEntry(4,4)+b.getEntry(4,4));


       //checking the commutative property of addition
       //a+b=b+a
       Matrix d,e;
       c=a+b; //LHS
       d=b+a; //RHS
       CHECK(c.getEntry(1,1)==d.getEntry(1,1));
       CHECK(c.getEntry(1,3)==d.getEntry(1,3));
       CHECK(c.getEntry(2,2)==d.getEntry(2,2));
       CHECK(c.getEntry(2,4)==d.getEntry(2,4));
       CHECK(c.getEntry(3,1)==d.getEntry(3,1));
       CHECK(c.getEntry(3,3)==d.getEntry(3,3));
       CHECK(c.getEntry(4,2)==d.getEntry(4,2));
       CHECK(c.getEntry(4,4)==d.getEntry(4,4));

       //checking associativity of the matrix
       //a+(b+c) = (a+b)+c
        fin>>c;
        d=(b+c);
        d=a+d;
        e=(a+b);
        e=e+c;
        CHECK(d.getEntry(1,1)==e.getEntry(1,1));
        CHECK(d.getEntry(1,3)==e.getEntry(1,3));
        CHECK(d.getEntry(2,2)==e.getEntry(2,2));
        CHECK(d.getEntry(2,4)==e.getEntry(2,4));
        CHECK(d.getEntry(3,1)==e.getEntry(3,1));
        CHECK(d.getEntry(3,3)==e.getEntry(3,3));
        CHECK(d.getEntry(4,2)==e.getEntry(4,2));
        CHECK(d.getEntry(4,4)==e.getEntry(4,4));
    }
}
TEST_CASE("Multiplication of two Matrix", "in2.txt"){
    const string fname= "in2.txt";
    ifstream fin(fname);
    if(fin.fail()){
        cout<<"File not found!"<<endl;
        exit(1);
    }
    else {
       Matrix a, b;
       fin>>a>>b;
       // MATRIX A:
       //1 0 2 0
       //0 3 0 4
       //5 0 6 0
       //0 7 0 8
        // MATRIX B:
       //2 0 3 0
       //0 4 0 5
       //7 0 8 0
       //0 9 0 2

       //MULTIPLICATION should give result
       //16 0 19 0
       //0 48 0 23
       //52 0 63 0
       //0 100 0 51

       CHECK(a.getDimension()==b.getDimension());
       Matrix c=a*b;
       CHECK(c.getEntry(1,1)==16);
       CHECK(c.getEntry(1,3)==19);
       CHECK(c.getEntry(2,2)==48);
       CHECK(c.getEntry(2,4)==23);
       CHECK(c.getEntry(3,1)==52);
       CHECK(c.getEntry(3,3)==63);
       CHECK(c.getEntry(4,2)==100);
       CHECK(c.getEntry(4,4)==51);


       //Checking associativity of multiplication
       Matrix d, e;
       fin>>d;
       //should obey (a*b)*d = a*(b*d)
       c=a*b ;  //first step LHS
       c =c*d;   //second step LHS
       e= b*d; // first step RHS
       e=a*e; //second step RHS
       CHECK(c.getEntry(1,1)==e.getEntry(1,1));
       CHECK(c.getEntry(1,3)==e.getEntry(1,3));
       CHECK(c.getEntry(2,2)==e.getEntry(2,2));
       CHECK(c.getEntry(2,4)==e.getEntry(2,4));
       CHECK(c.getEntry(3,1)==e.getEntry(3,1));
       CHECK(c.getEntry(3,3)==e.getEntry(3,3));
       CHECK(c.getEntry(4,2)==e.getEntry(4,2));
       CHECK(c.getEntry(4,4)==e.getEntry(4,4));
    }

}








#endif
