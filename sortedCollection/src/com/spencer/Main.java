package com.spencer;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.76, 100);
        stockList.addStock(temp);
        temp = new StockItem("doughnut", 0.26, 10);
        stockList.addStock(temp);
        temp = new StockItem("cake", 0.36, 15);
        stockList.addStock(temp);
        temp = new StockItem("biscuits", 1.76, 13);
        stockList.addStock(temp);
        temp = new StockItem("car", 23_876.76, 2);
        stockList.addStock(temp);

        temp = new StockItem("car", 24_000.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("mars bar", 0.36, 10);
        stockList.addStock(temp);
        temp = new StockItem("door", 23.76, 10);
        stockList.addStock(temp);
        temp = new StockItem("sellotape", 0.76, 8);
        stockList.addStock(temp);
        temp = new StockItem("shoes", 87.76, 4);
        stockList.addStock(temp);
        temp = new StockItem("jeans", 45.00, 100);
        stockList.addStock(temp);
        temp = new StockItem("jumper", 34.56, 5);
        stockList.addStock(temp);
        temp = new StockItem("glass", 4.99, 100);
        stockList.addStock(temp);
        temp = new StockItem("beer", 4.73, 100);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket spencersBasket = new Basket("Spencer");
        sellItem(spencersBasket, "car", 202);
        sellItem(spencersBasket, "keyboard", 1);

        System.out.println("======================================");
        System.out.println(stockList);
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
