package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for (OutsourcedPart part : outsourcedParts) {
            System.out.println(part.getName() + " " + part.getCompanyName());
        }
        long partCount = partRepository.count();
        long productCount = productRepository.count();

        if (partCount == 0 && productCount == 0) {
            InhousePart vacuumFilter = new InhousePart();
            vacuumFilter.setName("Vacuum Filter");
            vacuumFilter.setInv(100);
            vacuumFilter.setPrice(9.99);
            vacuumFilter.setId(1);
            vacuumFilter.setMinInv(90);
            vacuumFilter.setMaxInv(110);

            InhousePart vacuumBelt = new InhousePart();
            vacuumBelt.setName("Vacuum Belt");
            vacuumBelt.setInv(6);
            vacuumBelt.setPrice(4.99);
            vacuumBelt.setId(2);
            vacuumBelt.setMinInv(5);
            vacuumBelt.setMaxInv(100);

            InhousePart extensionHose = new InhousePart();
            extensionHose.setName("Extension Hose");
            extensionHose.setInv(200);
            extensionHose.setPrice(14.99);
            extensionHose.setId(3);
            extensionHose.setMinInv(5);
            extensionHose.setMaxInv(300);

            InhousePart brushRoll = new InhousePart();
            brushRoll.setName("Brush Roll");
            brushRoll.setInv(75);
            brushRoll.setPrice(19.99);
            brushRoll.setId(4);
            brushRoll.setMinInv(5);
            brushRoll.setMaxInv(300);

            InhousePart dustBag = new InhousePart();
            dustBag.setName("Dust Bag");
            dustBag.setInv(150);
            dustBag.setPrice(2.99);
            dustBag.setId(5);
            dustBag.setMinInv(5);
            dustBag.setMaxInv(300);

            partRepository.save(vacuumFilter);
            partRepository.save(vacuumBelt);
            partRepository.save(extensionHose);
            partRepository.save(brushRoll);
            partRepository.save(dustBag);

            Product proCleaner = new Product("VacuumTech Pro Cleaner", 199.99, 10);
            Product compact = new Product("VacuumTech Compact", 99.99, 15);
            Product wetDryVac = new Product("VacuumTech Wet/Dry Vac", 149.99, 20);
            Product roboticVacuum = new Product("VacuumTech Robotic Vacuum", 299.99, 5);
            Product handheld = new Product("VacuumTech Handheld", 49.99, 25);

            productRepository.save(proCleaner);
            productRepository.save(compact);
            productRepository.save(wetDryVac);
            productRepository.save(roboticVacuum);
            productRepository.save(handheld);

            System.out.println("Started in Bootstrap");
            System.out.println("Number of Products" + productRepository.count());
            System.out.println(productRepository.findAll());
            System.out.println("Number of Parts" + partRepository.count());
            System.out.println(partRepository.findAll());

        }
    }
}
