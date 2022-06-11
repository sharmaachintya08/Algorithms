//this is a MST program using prims algorithm (greedy approach)
//theres some problem in this program
//i dont understand this algo abhi ache se 
// i dont know how to create union ds

#include <stdio.h>
#include <stdlib.h>

void Prims(int n,int cost[10][10]){
    int i,j,u,v,min,mincost=0,visited[10],ne=1;
    for(i=1;i<=n;i++){
        visited[i]=0;//initially none of the vertex is visited
    }
    printf("\n the edges considered for the mst are\n ");
    visited[1]=1;//here we are starting to traverse the graph , so we have visited the first vertex
    while(ne<1){
        for(i=1,min=999;i<=n;i++){
            for(j=1;j<=n;j++){
                if(cost[i][j]<min){
                    if(visited[i]==0){//i should start with the vertex which have been marked as visited
                        continue;
                    }
                    else{
                        min = cost[i][j];
                        u=i;
                        v=j;
                    }
                }
            }
        }
        if(visited[u]==0||visited[v]==0){
            printf("%d edge(%d,%d)=%d",ne++,u,v,min);
            mincost = mincost+min;
            visited[v]=1;
        }
        cost[u][v]= cost[u][v]=999;
    }
    printf("cost of constructing mst is %d",mincost);
}
int main(){
    int i,j,n,cost[10][10];
    printf("\n read the number of nodes : ");
    scanf("%d",&n);
    printf("\n read cost matrix \n");
    for(i=1;i<=n;i++){
        for(j=1;j<=n;j++){
            scanf("%d",&cost[i][j]);
            if(cost[i][j]==0){
                cost[i][j]=999;//this is because if it read the minimum edge then it can read the 0 one and can self loop the node 
            }
        }
        Prims(n,cost);
        return 0;
    }
}