 bool flag = false;
    long  long int rev = 0;
    
    if( A < 0)
    {
        flag = true;
        A = -A;
    }
    
    while(A)
    {
        rev = rev * 10 + A%10;
        A = A/10;
    }
    
    if(flag == true)
        rev = -rev;
        
   // cout << rev << endl;
    if(rev > INT_MAX || rev < INT_MIN )
        return 0;
     return rev;    
}