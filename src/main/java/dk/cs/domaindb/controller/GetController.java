package dk.cs.domaindb.controller;

import dk.cs.domaindb.models.domain.Domain;
import dk.cs.domaindb.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("get")
public class GetController {

    DomainService domainService;

    @Autowired
    public GetController(DomainService domainService) {
        this.domainService = domainService;
    }




//     this method returns all domains, with either ascending or descending sorting
    @GetMapping("sort")
    public List<Domain> sort(@RequestParam(name = "sortField", defaultValue = "") String sortField,
                             @RequestParam(name = "sortOrder", defaultValue = "asc") String sortOrder) {
        Sort.Direction direction = "desc".equalsIgnoreCase(sortOrder) ? Sort.Direction.DESC : Sort.Direction.ASC;
        Sort sort = Sort.by(direction, sortField);
        return domainService.sortDomains(sort);
    }

    @GetMapping("search")
    public Domain domainByName(@RequestParam(name = "name") String name){
        return domainService.findDomainByName(name);
    }


    // this method accepts a list of domains and returns which domains are duplicated in that list.
    @GetMapping("duplicate")
    public List<Domain> duplicate(@RequestBody List<Domain> domains){
        return domainService.findDuplicates(domains);
    }


    // this method accepts a list of domains and returns which domains are unique in that list.
    @GetMapping("unique")
    public List<Domain> unique(List<Domain> domains){
        return domainService.findUniques(domains);
    }


}
