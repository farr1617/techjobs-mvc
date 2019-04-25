@RequestMapping(value = "results")
public String processSearch(Model model, @RequestParam String searchType,@RequestParam String searchTerm) {
        ArrayList<HashMap<String, String>> jobs;
        if (searchType.equals("all")) {

        jobs = JobData.findByValue(searchTerm);

        } else {

        jobs = JobData.findByColumnAndValue(searchType, searchTerm);
        }
        model.addAttribute( "columns", ListController.columnChoices);
        model.addAttribute("searchType", searchType);
        model.addAttribute("searchTerm", searchTerm) ;
        model.addAttribute("jobs", jobs);
        return "search";



        }
//
//    private void If(boolean all) {
//
//
// }