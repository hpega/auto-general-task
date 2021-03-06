/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.auto.api;

import com.auto.model.BalanceTestResult;
import com.auto.model.ToDoItemValidationError;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-24T09:09:40.663+10:00")

@Api(value = "tasks", description = "the tasks API")
public interface TasksApi {

    @ApiOperation(value = "Checks if brackets in a string are balanced", nickname = "tasksValidateBracketsGet", notes = "Brackets in a string are considered to be balanced if the following criteria are met: - For every opening bracket (i.e., **`(`**, **`{`**, or **`[`**), there is a matching closing bracket (i.e., **`)`**, **`}`**, or **`]`**) of the same type (i.e., **`(`** matches **`)`**, **`{`** matches **`}`**, and **`[`** matches **`]`**). An opening bracket must appear before (to the left of) its matching closing bracket. For example, **`]{}[`** is not balanced. - No unmatched braces lie between some pair of matched bracket. For example, **`({[]})`** is balanced, but **`{[}]`** and **`[{)]`** are not balanced.", response = BalanceTestResult.class, tags={ "tasks", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = BalanceTestResult.class),
        @ApiResponse(code = 400, message = "Validation error", response = ToDoItemValidationError.class) })
    @RequestMapping(value = "/tasks/validateBrackets",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<BalanceTestResult> tasksValidateBracketsGet(@NotNull @Size(min=1,max=100) @ApiParam(value = "Input string (max length 100)", required = true) @Valid @RequestParam(value = "input", required = true) String input);

}
