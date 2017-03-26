import java.util.*;





class Step{
    int x,y,d;
    public Step(int x,int y,int d) {
        this.x = x;//横坐标
        this.y = y;//纵坐标
        this.d = d;//方向
    }
}


public class maze2 {

	public static int getnum(int x1,int y1,int x2,int y2){
		return (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
	}
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	while(sc.hasNextInt()){
    		//构造迷宫
    		int n=sc.nextInt();
    		int m=sc.nextInt();
    		int[][] maze=new int[n][m];
    		ArrayList<int[][]> list = new ArrayList<int[][]>();
    		 for(int i = 0; i < n; ++i) {
    			 String str=sc.next();
    	            for(int j = 0; j < m; ++j) {
    	                char  c= str.charAt(j);
    	                if(c=='.'){
    	                	 maze[i][j] = 0;
    	                	 int[][] endij=new int[1][2];
    	                	 endij[0][0]=i+1;
    	                	 endij[0][1]=j+1;
    	                	 list.add(endij);
    	                	 
    	                }else{
   	                	 maze[i][j] = 1;
   	                } 	
   	            }
   	        }
   		 int begini=sc.nextInt()+1;
   		 int beginj=sc.nextInt()+1;
   		 int max=0;
   		 int endi=0;
   		 int endj=0;
   		 for(int i=0;i<list.size();i++){
   			 int temp=getnum(list.get(i)[0][0],list.get(i)[0][1],begini,beginj);
   			 if(temp>max){
   				 max=temp;
   				 endi=list.get(i)[0][0];
   				 endj=list.get(i)[0][1];
   			 }
   		 }
   		int k=sc.nextInt();
   		int[][] move=new int[k][2];
   		for(int i=0;i<k;i++){
   			for(int j=0;j<2;j++){
   				move[i][j]=sc.nextInt();
   			}
   		}
       Stack s = new Stack();
       Stack s1 = new Stack();
       int a = path(maze, move, s,begini,beginj,endi,endj);
       if(s.isEmpty()){
       	System.out.println("-1");
       }else{
       	System.out.println(s.size());
       }
   	}
   }
   
   public static int path(int[][] maze,int[][] move,Stack s,int begini,int beginj,int endi,int endj){
       Step temp = new Step(begini,beginj,-1); //起点
       s.push(temp);
       while(!s.isEmpty()){
           temp = (Step) s.pop();
           int x = temp.x;
           int y = temp.y;
           int d = temp.d+1;
           while(d<move.length){
               int i = x + move[d][0];
               int j = y + move[d][1];
               if(i<=maze.length-1 && j<=maze[0].length-1 && maze[i][j] == 0){    //该点可达
                   temp = new Step(i,j,d); //到达新点
                   s.push(temp);
                   x = i;
                   y = j;
                   maze[x][y] = -1;  //到达新点，标志已经到达
                   if(x == endi && y == endj){
                       return 1;  //到达出口，迷宫有路，返回1
                   }else{
                       d = 0;  //重新初始化方向
                       
                   }
               }else{
                   d++; //改变方向
               }
           }
       }
       return 0;
   }

}