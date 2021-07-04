#include <stdio.h>
#include <stdlib.h>

void reverse( char str[] )
{
    char * str2 = str;

    while( str2 && *str2 )
        str2++;

    for( str2--; str < str2; str++, str2-- )
    {
        *str = *str ^ *str2;
        *str2 = *str ^ *str2;
        *str = *str ^ *str2;
    }
}

int main( void )
{
    char abc[] = "UM CIENTISTA DA COMPUTACAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
    char cde[] = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OACATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OACATUPMOC OD ODATSE ED SAIOG";
    reverse( abc );
    reverse( cde );
    printf("%s\n", abc );
    printf("\n");
    printf("%s\n", cde );

    return 0;
}




