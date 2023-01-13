package tasks.grocery;

import java.util.ArrayList;
import java.util.regex.Pattern;

//TODO
// 1. addGroceryItem
// 2. printGroceryList
// 3. removeGroceryItem
// 4. modifyGroceryItem
// 5. searchItem
public class GroceryList {

    private ArrayList<String>  groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        if(checkIfValid(item)){
            groceryList.add(item);
        }else{
            System.out.println("Item name is not valid");
        }
    }

    private int findItem(String searchedItem){
        return groceryList.indexOf(searchedItem);
    }

    private boolean checkIfValid(String item) {
        return Pattern.matches("[a-zA-Z]+[0-9a-zA-Z]", item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void removeGroceryItem (String item){
        int position = findItem(item);
        if(position >=0){
            groceryList.remove(position);
            System.out.println(item + " was deleted");
        }else {
            System.out.println("Item is not in the list");
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        if(checkIfValid(newItem)){
            if(position >=0 && position < groceryList.size()) {
                groceryList.set(position, newItem);
                System.out.println("Grocery item " + groceryList.get(position) + " was modified");
            }else{
                System.out.println("Position is not valid");
            }
        }else{
            System.out.println("Item is not valid");
        }

    }

    public boolean searchItem (String searchedItem){
        if(findItem(searchedItem) >= 0){
            return true;
        }else{
            return false;
        }
    }

    public void deleteAllItems(){
        groceryList.clear();
        System.out.println("All items in the list have been deleted");
    }
}
