package example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import example.model.filter.*;
import example.model.filter.word.*;
import example.service.DefaultService;
import example.service.FilterService;

@RestController
@RequestMapping("/filter")
public class FilterRestController {

	@Autowired
	DefaultService defaultService;

	@Autowired
	FilterService filterService;

	@RequestMapping(path="/keywords", method=RequestMethod.GET)
	public Iterable<KeywordsFilter> getAllKeywords(){
		return filterService.getIteratedFilter(
						defaultService.getRepoList()
					);
	}
}
