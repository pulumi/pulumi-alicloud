// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apig;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.apig.HttpApiArgs;
import com.pulumi.alicloud.apig.inputs.HttpApiState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a APIG Http Api resource.
 * 
 * For information about APIG Http Api and how to use it, see [What is Http Api](https://www.alibabacloud.com/help/en/).
 * 
 * &gt; **NOTE:** Available since v1.240.0.
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.resourcemanager.ResourcemanagerFunctions;
 * import com.pulumi.alicloud.resourcemanager.inputs.GetResourceGroupsArgs;
 * import com.pulumi.alicloud.apig.HttpApi;
 * import com.pulumi.alicloud.apig.HttpApiArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var config = ctx.config();
 *         final var name = config.get("name").orElse("terraform-example");
 *         final var protocol = config.get("protocol").orElse("HTTP");
 *         final var protocolHttps = config.get("protocolHttps").orElse("HTTPS");
 *         final var default = ResourcemanagerFunctions.getResourceGroups();
 * 
 *         var defaultHttpApi = new HttpApi("defaultHttpApi", HttpApiArgs.builder()
 *             .httpApiName(name)
 *             .protocols(protocol)
 *             .basePath("/v1")
 *             .description("zhiwei_pop_examplecase")
 *             .type("Rest")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * APIG Http Api can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:apig/httpApi:HttpApi example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:apig/httpApi:HttpApi")
public class HttpApi extends com.pulumi.resources.CustomResource {
    /**
     * API path
     * 
     */
    @Export(name="basePath", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> basePath;

    /**
     * @return API path
     * 
     */
    public Output<Optional<String>> basePath() {
        return Codegen.optional(this.basePath);
    }
    /**
     * Description of API
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of API
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="httpApiName", refs={String.class}, tree="[0]")
    private Output<String> httpApiName;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> httpApiName() {
        return this.httpApiName;
    }
    /**
     * API protocol
     * 
     */
    @Export(name="protocols", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> protocols;

    /**
     * @return API protocol
     * 
     */
    public Output<List<String>> protocols() {
        return this.protocols;
    }
    /**
     * The ID of the resource group
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * API type
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return API type
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HttpApi(java.lang.String name) {
        this(name, HttpApiArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HttpApi(java.lang.String name, HttpApiArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HttpApi(java.lang.String name, HttpApiArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:apig/httpApi:HttpApi", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private HttpApi(java.lang.String name, Output<java.lang.String> id, @Nullable HttpApiState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:apig/httpApi:HttpApi", name, state, makeResourceOptions(options, id), false);
    }

    private static HttpApiArgs makeArgs(HttpApiArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? HttpApiArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static HttpApi get(java.lang.String name, Output<java.lang.String> id, @Nullable HttpApiState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HttpApi(name, id, state, options);
    }
}