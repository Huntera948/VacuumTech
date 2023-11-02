# VacuumTech

VacuumTech is a comprehensive inventory management system designed specifically for vacuum parts and products. The system allows users to manage in-house and outsourced parts, as well as a range of vacuum products. With a user-friendly interface and robust backend, VacuumTech ensures efficient inventory management for vacuum businesses.

## Features

- **Inventory Management**: Easily add, update, and delete parts and products from the inventory.
- **In-house and Outsourced Parts**: Manage both in-house manufactured parts and outsourced parts with separate functionalities.
- **Product Purchase**: Integrated "Buy Now" functionality for products with inventory decrement and success/failure messages.
- **Inventory Validation**: Ensures that the inventory is always between the minimum and maximum values.
- **About Page**: Provides information about the company to web viewers.
- **Customizable UI**: The user interface includes the shop name, product names, and part names, and can be customized as per requirements.

## Installation

1. Clone the repository:
   ```
   git clone https://github.com/Huntera948/VacuumTech.git
   ```
2. Navigate to the project directory:
   ```
   cd VacuumTech
   ```
3. Install the required dependencies:
   ```
   mvn install
   ```
4. Run the application:
   ```
   mvn spring-boot:run
   ```

## Usage

1. Open a web browser and navigate to `http://localhost:8080`.
2. Explore the system by adding parts, products, and making purchases.

## Testing

Unit tests have been implemented to ensure the functionality of the maximum and minimum fields for parts. To run the tests, use:
```
mvn test
```
