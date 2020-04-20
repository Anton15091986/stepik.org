public static void moveRobot(Robot robot, int toX, int toY)
{
	int x=robot.getX();
	int y=robot.getY();
	if(toX==x);
	else if(toX-x>0)
	{
		switch (robot.getDirection().ordinal())
		{
			case 0:
				robot.turnRight();
				break;
			case 1:
				robot.turnLeft();
				break;
			case 2:
				robot.turnRight();
				robot.turnRight();
				break;
			case 3:
				break;
		}
		while(x<toX)
		{
			robot.stepForward();
			x++;
		}
	}
	else
	{
		switch (robot.getDirection().ordinal())
		{
			case 0:
				robot.turnLeft();
				break;
			case 1:
				robot.turnRight();
				break;
			case 2:
				break;
			case 3:
				robot.turnRight();
				robot.turnRight();
				break;
		}
		while(x>toX)
		{
			robot.stepForward();
			x--;
		}
		
	}
	if(toY==y);
	else if(toY-y>0)
	{
		switch (robot.getDirection().ordinal())
		{
			case 0:
				break;
			case 1:
				robot.turnLeft();
				robot.turnLeft();
				break;
			case 2:
				robot.turnRight();
				break;
			case 3:
				robot.turnLeft();
				break;
		}
		while(y<toY)
		{
			robot.stepForward();
			y++;
		}
	}
	else
	{
		switch (robot.getDirection().ordinal())
		{
			case 0:
				robot.turnLeft();
				robot.turnLeft();
				break;
			case 1:
				break;
			case 2:
				robot.turnLeft();
				break;
			case 3:
				robot.turnRight();
				break;
		}
		while(y>toY)
		{
			robot.stepForward();
			y--;
		}
		
	}	
}