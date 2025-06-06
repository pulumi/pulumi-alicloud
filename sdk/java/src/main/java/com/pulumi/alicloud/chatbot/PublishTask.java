// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.chatbot;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.chatbot.PublishTaskArgs;
import com.pulumi.alicloud.chatbot.inputs.PublishTaskState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Chatbot Publish Task resource.
 * 
 * For information about Chatbot Publish Task and how to use it, see [What is Publish Task](https://help.aliyun.com/document_detail/433996.html).
 * 
 * &gt; **NOTE:** Available since v1.203.0.
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
 * import com.pulumi.alicloud.chatbot.ChatbotFunctions;
 * import com.pulumi.alicloud.chatbot.inputs.GetAgentsArgs;
 * import com.pulumi.alicloud.chatbot.PublishTask;
 * import com.pulumi.alicloud.chatbot.PublishTaskArgs;
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
 *         final var default = ChatbotFunctions.getAgents(GetAgentsArgs.builder()
 *             .build());
 * 
 *         var defaultPublishTask = new PublishTask("defaultPublishTask", PublishTaskArgs.builder()
 *             .bizType("faq")
 *             .agentKey(default_.agents()[0].agentKey())
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
 * Chatbot Publish Task can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:chatbot/publishTask:PublishTask example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:chatbot/publishTask:PublishTask")
public class PublishTask extends com.pulumi.resources.CustomResource {
    /**
     * The business space key. If you do not set it, the default business space is accessed. The key value is obtained on the business management page of the primary account.
     * 
     */
    @Export(name="agentKey", refs={String.class}, tree="[0]")
    private Output<String> agentKey;

    /**
     * @return The business space key. If you do not set it, the default business space is accessed. The key value is obtained on the business management page of the primary account.
     * 
     */
    public Output<String> agentKey() {
        return this.agentKey;
    }
    /**
     * The type of the publishing unit. Please use the CreateInstancePublishTask API to publish the robot.
     * 
     */
    @Export(name="bizType", refs={String.class}, tree="[0]")
    private Output<String> bizType;

    /**
     * @return The type of the publishing unit. Please use the CreateInstancePublishTask API to publish the robot.
     * 
     */
    public Output<String> bizType() {
        return this.bizType;
    }
    /**
     * UTC time of task creation
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return UTC time of task creation
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Additional release information. Currently supported: If the BizType is faq, enter the category Id in this field to indicate that only the knowledge under these categories is published.
     * 
     */
    @Export(name="dataIdLists", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> dataIdLists;

    /**
     * @return Additional release information. Currently supported: If the BizType is faq, enter the category Id in this field to indicate that only the knowledge under these categories is published.
     * 
     */
    public Output<Optional<List<String>>> dataIdLists() {
        return Codegen.optional(this.dataIdLists);
    }
    /**
     * UTC time for task modification
     * 
     */
    @Export(name="modifyTime", refs={String.class}, tree="[0]")
    private Output<String> modifyTime;

    /**
     * @return UTC time for task modification
     * 
     */
    public Output<String> modifyTime() {
        return this.modifyTime;
    }
    /**
     * The status of the task.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the task.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PublishTask(java.lang.String name) {
        this(name, PublishTaskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PublishTask(java.lang.String name, PublishTaskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PublishTask(java.lang.String name, PublishTaskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:chatbot/publishTask:PublishTask", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private PublishTask(java.lang.String name, Output<java.lang.String> id, @Nullable PublishTaskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:chatbot/publishTask:PublishTask", name, state, makeResourceOptions(options, id), false);
    }

    private static PublishTaskArgs makeArgs(PublishTaskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PublishTaskArgs.Empty : args;
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
    public static PublishTask get(java.lang.String name, Output<java.lang.String> id, @Nullable PublishTaskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PublishTask(name, id, state, options);
    }
}
