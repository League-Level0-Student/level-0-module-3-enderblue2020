int bottle = 99;
for(int i=0; i < 9900; i++)
{
print(bottle + " bottles of " + bottle + " bottles of beer. Take one down and pass it around, ");
bottle--;
print(bottle+ " bottles of beer on the wall.");
if(bottle == 0){
print("No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall.");
bottle = 99;
}
}
