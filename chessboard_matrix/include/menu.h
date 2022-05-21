#ifndef MENU_H
#define MENU_H
#include "Matrix.h"
#include <vector>
class menu
{
    public:
        menu(){};
        void show();
        void execute();
        void quit();
        void cls();
    private:
        Matrix _a;
        void setMatrix();
        void addMatrices();
        void multiplyMatrices();
        void getMatrixEntry();
        void matrixPrint();

};

#endif // MENU_H
