// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.message;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.message.ServiceTopicArgs;
import com.pulumi.alicloud.message.inputs.ServiceTopicState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Message Notification Service Topic resource.
 * 
 * For information about Message Notification Service Topic and how to use it, see [What is Topic](https://www.alibabacloud.com/help/en/message-service/latest/createtopic).
 * 
 * &gt; **NOTE:** Available since v1.188.0.
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
 * import com.pulumi.alicloud.message.ServiceTopic;
 * import com.pulumi.alicloud.message.ServiceTopicArgs;
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
 *         final var name = config.get("name").orElse("tf-example");
 *         var default_ = new ServiceTopic("default", ServiceTopicArgs.builder()
 *             .topicName(name)
 *             .maxMessageSize(12357)
 *             .loggingEnabled(true)
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
 * Message Notification Service Topic can be imported using the id or topic_name, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:message/serviceTopic:ServiceTopic example &lt;topic_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:message/serviceTopic:ServiceTopic")
public class ServiceTopic extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether to enable the log management feature. Default value: false. Valid values:
     * 
     */
    @Export(name="loggingEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> loggingEnabled;

    /**
     * @return Specifies whether to enable the log management feature. Default value: false. Valid values:
     * 
     */
    public Output<Optional<Boolean>> loggingEnabled() {
        return Codegen.optional(this.loggingEnabled);
    }
    /**
     * The maximum size of a message body that can be sent to the topic. Unit: bytes. Valid values: 1024-65536. Default value: 65536.
     * 
     */
    @Export(name="maxMessageSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxMessageSize;

    /**
     * @return The maximum size of a message body that can be sent to the topic. Unit: bytes. Valid values: 1024-65536. Default value: 65536.
     * 
     */
    public Output<Integer> maxMessageSize() {
        return this.maxMessageSize;
    }
    /**
     * Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 255 characters.
     * 
     */
    @Export(name="topicName", refs={String.class}, tree="[0]")
    private Output<String> topicName;

    /**
     * @return Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 255 characters.
     * 
     */
    public Output<String> topicName() {
        return this.topicName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceTopic(java.lang.String name) {
        this(name, ServiceTopicArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceTopic(java.lang.String name, ServiceTopicArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceTopic(java.lang.String name, ServiceTopicArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:message/serviceTopic:ServiceTopic", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ServiceTopic(java.lang.String name, Output<java.lang.String> id, @Nullable ServiceTopicState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:message/serviceTopic:ServiceTopic", name, state, makeResourceOptions(options, id), false);
    }

    private static ServiceTopicArgs makeArgs(ServiceTopicArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ServiceTopicArgs.Empty : args;
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
    public static ServiceTopic get(java.lang.String name, Output<java.lang.String> id, @Nullable ServiceTopicState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceTopic(name, id, state, options);
    }
}
