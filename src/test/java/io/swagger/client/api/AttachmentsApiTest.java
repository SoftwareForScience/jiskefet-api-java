/*
 * Jiskefet
 * Running with /api prefix
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.CreateAttachmentDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AttachmentsApi
 */
@Ignore
public class AttachmentsApiTest {

    private final AttachmentsApi api = new AttachmentsApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void attachmentsIdLogsGetTest() throws ApiException {
        Integer id = null;
        Object response = api.attachmentsIdLogsGet(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void attachmentsPostTest() throws ApiException {
        CreateAttachmentDto createAttachmentDto = null;
        api.attachmentsPost(createAttachmentDto);

        // TODO: test validations
    }
    
}
