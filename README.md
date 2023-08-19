### Alex's README file

---
A.  Create your subgroup and project by logging into GitLab using the web link provided and using the 
“GitLab How-To” web link, and do the following:

•   Clone the project to the IDE.

•   Commit with a message and push when you complete each of the tasks listed below (e.g., parts C to J).

*Note: You may commit and push whenever you want to back up your changes, even if a task is not complete.

•   Submit a copy of the Git repository URL and a copy of the repository branch history retrieved from your 
repository, which must include the commit messages and dates.

*Note: Wait until you have completed all the following prompts before you create your copy of the 
repository branch history.*

---

B. Create a README file that includes notes describing where in the code to find the changes you made for 
each of parts C to J. Each note should include the prompt, file name, line number, and change.

    For this step, I renamed the old README.md file to "oldREADME.md". I have named this file "README.md".

---
C.  Customize the HTML user interface for your customer’s application. The user interface should 
include the shop name, the product names, and the names of the parts.

*Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or 
any images, colors, and styles, although it is not required.*

    1. Updated Line 14 of the "mainscreen.html" file from "<title>My Bicycle Shop</title>" to "<title>VacuumTech/<title>".
    2. Updated Line 19 of the "mainscreen.html" file from "<h1>Shop</h1>" to "<h1 class="display-2">VacuumTech</h1>".

---
D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation 
to and from the “About” page and the main screen.

    1. Created "about.html" file.
    2. Added a new method inside the MainScreenControllerr.java file on lines 55-62 to handle requests to the About page 
       and requests back to the mainscreen from the About page.
    3. Added a link to the About page on line 21, and a <hr> tag on line 22.

---
E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five
    products in your sample inventory and should not overwrite existing data in the database.

*Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the
sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your
products. When duplicate items are added, make a “multi-pack” part.*

    1. Added lines 67-113 in BootStrapData.java to add sample inventory.
    2. Added lines 63-66 in BootStrapData.java to check if part and product count is 0 before adding sample inventory.
    3. Added line 3 in BootStrapData.java: "import com.example.demo.domain.InhousePart;".
    4. Updated line 11 of application.properties to: "spring.jpa.hibernate.ddl-auto=create-drop".

---
F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:

•   The “Buy Now” button must be next to the buttons that update and delete products.

•   The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.

•   Display a message that indicates the success or failure of a purchase.

    1. mainscreen.html: Added lines 87-90: Added Buy Now buttons, mapped to /buyProduct. Added hidden input field for
       passing tempProduct.id to controller.
    2. BuyProductController.java: New file. Decrements Inventory by 1 after Buy Now buttons are clicked. Uses findById
       method for this. Contains logic to make sure inventory is greater than 0.
    3. purchase-error.html: Created this file for Purchase Error message.
    4. purchase-success.html: Created this file for Purchase Success message.

---
G. Modify the parts to track maximum and minimum inventory by doing the following:

•   Add additional fields to the part entity for maximum and minimum inventory.

•   Modify the sample inventory to include the maximum and minimum fields.

•   Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.

•   Rename the file the persistent storage is saved to.

•   Modify the code to enforce that the inventory is between or at the minimum and maximum value.

    1. Part.java: Added lines 31-34: added minInv and maxInv fields with @Min annotation.
    2. Part.java: Added lines 50,55,56: updated constructor to include minInv and maxInv.
    3. Part.java: Added lines 116-120: added getters and setters for minInv and maxInv.
    4. BootStrapData.java: Added lines 72,73,80,81,88,89,96,97,104,105: added setters for minInv and maxInv fields in 
       Parts sample inventory.
    5. InhousePartForm.html: Added lines 34-42 to add minInv and maxInv fields. Added labels to other fields on lines
       16-33.
    6. OustourcedPartForm.html: Added lines 35-43 to add minInv and maxInv fields. Added labels to other fields on lines
       17-34.
    7. application.properties: Updated line 6 to read: "spring.datasource.url=jdbc:h2:file:~/vacuum-db".
    8. Deleted spring-boot-h2-db102.mv.db file.
    9. Part.java: Added lines 121-123: added method to check if inventory is valid based on min and max values.
    10. AddInhousePartController.java: Added lines 42-44: added inventory validation logic to submitForm method.
    11. AddOutsourcedPartController.java: Added lines 43-45: added inventory validation logic to submitForm method.

---
H. Add validation for between or at the maximum and minimum fields. The validation must include the following:

•   Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.

•   Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.

•   Display error messages when adding and updating parts if the inventory is greater than the maximum.

    1. AddInhousePartController.java: Added lines 42-46: added more specific inventory validation logic to submitForm method.
       Error messages now display when the inventory is below the minimum or above the maximum.
    2. AddOutsourcedPartController.java: Added lines 43-47: added more specific inventory validation logic to submitForm method.
       Error messages now display when the inventory is below the minimum or above the maximum.
    3. EnufPartsValidator.java: Added lines 38-42: added logic to check if any parts for product would fall below their minimum.
    4. ValidEnufParts.java: Updated line 20: made error message more accurate.

---