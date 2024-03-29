// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.apigateway.PluginAttachmentArgs;
import com.pulumi.alicloud.apigateway.inputs.PluginAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.apigateway.Group;
 * import com.pulumi.alicloud.apigateway.GroupArgs;
 * import com.pulumi.alicloud.apigateway.Api;
 * import com.pulumi.alicloud.apigateway.ApiArgs;
 * import com.pulumi.alicloud.apigateway.inputs.ApiRequestConfigArgs;
 * import com.pulumi.alicloud.apigateway.inputs.ApiHttpServiceConfigArgs;
 * import com.pulumi.alicloud.apigateway.inputs.ApiRequestParameterArgs;
 * import com.pulumi.alicloud.apigateway.Plugin;
 * import com.pulumi.alicloud.apigateway.PluginArgs;
 * import com.pulumi.alicloud.apigateway.PluginAttachment;
 * import com.pulumi.alicloud.apigateway.PluginAttachmentArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;terraform_example&#34;);
 *         var exampleGroup = new Group(&#34;exampleGroup&#34;, GroupArgs.builder()        
 *             .description(name)
 *             .build());
 * 
 *         var exampleApi = new Api(&#34;exampleApi&#34;, ApiArgs.builder()        
 *             .groupId(exampleGroup.id())
 *             .description(name)
 *             .authType(&#34;APP&#34;)
 *             .forceNonceCheck(false)
 *             .requestConfig(ApiRequestConfigArgs.builder()
 *                 .protocol(&#34;HTTP&#34;)
 *                 .method(&#34;GET&#34;)
 *                 .path(&#34;/example/path&#34;)
 *                 .mode(&#34;MAPPING&#34;)
 *                 .build())
 *             .serviceType(&#34;HTTP&#34;)
 *             .httpServiceConfig(ApiHttpServiceConfigArgs.builder()
 *                 .address(&#34;http://apigateway-backend.alicloudapi.com:8080&#34;)
 *                 .method(&#34;GET&#34;)
 *                 .path(&#34;/web/cloudapi&#34;)
 *                 .timeout(12)
 *                 .aoneName(&#34;cloudapi-openapi&#34;)
 *                 .build())
 *             .requestParameters(ApiRequestParameterArgs.builder()
 *                 .name(&#34;example&#34;)
 *                 .type(&#34;STRING&#34;)
 *                 .required(&#34;OPTIONAL&#34;)
 *                 .in(&#34;QUERY&#34;)
 *                 .inService(&#34;QUERY&#34;)
 *                 .nameService(&#34;exampleservice&#34;)
 *                 .build())
 *             .stageNames(            
 *                 &#34;RELEASE&#34;,
 *                 &#34;TEST&#34;)
 *             .build());
 * 
 *         var examplePlugin = new Plugin(&#34;examplePlugin&#34;, PluginArgs.builder()        
 *             .description(&#34;tf_example&#34;)
 *             .pluginName(&#34;tf_example&#34;)
 *             .pluginData(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;allowOrigins&#34;, &#34;api.foo.com&#34;),
 *                     jsonProperty(&#34;allowMethods&#34;, &#34;GET,POST,PUT,DELETE,HEAD,OPTIONS,PATCH&#34;),
 *                     jsonProperty(&#34;allowHeaders&#34;, &#34;Authorization,Accept,Accept-Ranges,Cache-Control,Range,Date,Content-Type,Content-Length,Content-MD5,User-Agent,X-Ca-Signature,X-Ca-Signature-Headers,X-Ca-Signature-Method,X-Ca-Key,X-Ca-Timestamp,X-Ca-Nonce,X-Ca-Stage,X-Ca-Request-Mode,x-ca-deviceid&#34;),
 *                     jsonProperty(&#34;exposeHeaders&#34;, &#34;Content-MD5,Server,Date,Latency,X-Ca-Request-Id,X-Ca-Error-Code,X-Ca-Error-Message&#34;),
 *                     jsonProperty(&#34;maxAge&#34;, 172800),
 *                     jsonProperty(&#34;allowCredentials&#34;, true)
 *                 )))
 *             .pluginType(&#34;cors&#34;)
 *             .build());
 * 
 *         var examplePluginAttachment = new PluginAttachment(&#34;examplePluginAttachment&#34;, PluginAttachmentArgs.builder()        
 *             .apiId(exampleApi.apiId())
 *             .groupId(exampleGroup.id())
 *             .pluginId(examplePlugin.id())
 *             .stageName(&#34;RELEASE&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="alicloud:apigateway/pluginAttachment:PluginAttachment")
public class PluginAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The api_id that plugin attaches to.
     * 
     */
    @Export(name="apiId", refs={String.class}, tree="[0]")
    private Output<String> apiId;

    /**
     * @return The api_id that plugin attaches to.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }
    /**
     * The group that the api belongs to.
     * 
     */
    @Export(name="groupId", refs={String.class}, tree="[0]")
    private Output<String> groupId;

    /**
     * @return The group that the api belongs to.
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }
    /**
     * The plugin that attaches to the api.
     * 
     */
    @Export(name="pluginId", refs={String.class}, tree="[0]")
    private Output<String> pluginId;

    /**
     * @return The plugin that attaches to the api.
     * 
     */
    public Output<String> pluginId() {
        return this.pluginId;
    }
    /**
     * Stage that the plugin attaches to.
     * 
     */
    @Export(name="stageName", refs={String.class}, tree="[0]")
    private Output<String> stageName;

    /**
     * @return Stage that the plugin attaches to.
     * 
     */
    public Output<String> stageName() {
        return this.stageName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PluginAttachment(String name) {
        this(name, PluginAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PluginAttachment(String name, PluginAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PluginAttachment(String name, PluginAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:apigateway/pluginAttachment:PluginAttachment", name, args == null ? PluginAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PluginAttachment(String name, Output<String> id, @Nullable PluginAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:apigateway/pluginAttachment:PluginAttachment", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static PluginAttachment get(String name, Output<String> id, @Nullable PluginAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PluginAttachment(name, id, state, options);
    }
}
