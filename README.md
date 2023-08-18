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