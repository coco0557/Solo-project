🍜 Restaurant Restock System

This is a Java-based inventory management system designed for 
the restaurant, where I currently work. The system helps digitise and 
streamline stock tracking for meats, vegetables, sauces, and more,
making restocking more efficient and accessible to staff even when off-site.

📌 Purpose

The system was created to:
- Keep stock levels organised in categories
- Check for low-stock items
- Search and update stock quantities
- Support future expansions like user interface and data persistence

👨‍💻 About the Developer

I’m a Software Engineering for Business student, starting my second year in September 2025. 
This is a self-led learning project to apply Java, Object-Oriented Programming, 
and design principles in a real-world context. 
I’m documenting all progress and learning as I go.

💡 Features

- 🗃️ Category-based structure using OOP (Meat, Veg, Spices, etc.)
- ✅ Add, search, and update stock items
- 🔎 Low-stock checker (threshold adjustable)
- 📦 InventoryManager class for centralised control
- 🧪 User interaction via console input (Scanner)
- 🧱 Scalable codebase for future expansion

🧱 Project Structure

── Item.java # Class representing an item with name + quantity

 StockCategory.java # Superclass for all category types

 InventoryManager.java # Manages the entire stock system


─ spiceAndSeasonings.java # Category: Spices and Seasonings

MeatAndSeafood.java # Category: Meats & Seafood

VegandFresh.java # Category: Vegetables & Fresh Produce

CannedAndJarred.java # Category: Canned & Jarred goods

noodlesAndRice.java # Category: Noodles & Rice

preparedFrozenItems.java # Category: Frozen prepared items

── MainApp.java # Entry point of the program with user input menu

🔧 Technologies Used

- Java 17+  
- Apache NetBeans 25  
- Maven (auto-managed by NetBeans)

✅ Current Progress

✔ Classes refactored using OOP principles  
✔ Stock items organised in categories  
✔ Inventory manager implemented  
✔ Console interaction enabled  
✔ Successfully tested and runs smoothly 
