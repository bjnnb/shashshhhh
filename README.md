#include <iostream>

const size_t ARRAY_SIZE = 128;
void enterSize(size_t& size);
void enterChrArray(size_t size, char a[]);
void intFromChar(size_t size, char a[], int b[]);
void plusOne(size_t size, size_t k, char a[], int b[], char plus[]);

int main()
{

    size_t size = 0, k = 0;
    enterSize(size);
    if (size > ARRAY_SIZE)
    {
        std::cout << "Enter a valid number";
        return 1;
    }
    std::cout << "Enter K" << std::endl;
    std::cin >> k;
    char a[ARRAY_SIZE], plus[ARRAY_SIZE];
    int b[ARRAY_SIZE];
    enterChrArray(size, a);


    return 0;
}

void enterSize(size_t& size)
{

    std::cout << "Enter the size" << std::endl;
    std::cin >> size;
}

void enterChrArray(size_t size, char a[])
{
    std::cout << "Enter the array" << std::endl;
    for (int i = 0; i < size; i++)
    {
        std::cin >> a[i];
    }
}

void intFromChar(size_t size, char a[], int b[])
{
    for (int i = 0; i < size; i++)
    {
        char temp = a[i];
        b[i] = temp - 'A' + 10;
    }
}

void plusOne(size_t size, size_t k, char a[], int b[], char plus[])
{
    int index = k - 1;
    for (int i = 0; i < size; i++)
    {
        
    }
}
