// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.amqp;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.amqp.ExchangeArgs;
import com.pulumi.alicloud.amqp.inputs.ExchangeState;
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
 * Provides a RabbitMQ (AMQP) Exchange resource.
 * 
 * For information about RabbitMQ (AMQP) Exchange and how to use it, see [What is Exchange](https://www.alibabacloud.com/help/en/message-queue-for-rabbitmq/latest/createexchange).
 * 
 * &gt; **NOTE:** Available since v1.128.0.
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
 * import com.pulumi.alicloud.amqp.Instance;
 * import com.pulumi.alicloud.amqp.InstanceArgs;
 * import com.pulumi.alicloud.amqp.Exchange;
 * import com.pulumi.alicloud.amqp.ExchangeArgs;
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
 *         final var virtualHostName = config.get("virtualHostName").orElse("/");
 *         var createInstance = new Instance("createInstance", InstanceArgs.builder()
 *             .renewalDuration(1)
 *             .maxTps("3000")
 *             .periodCycle("Month")
 *             .maxConnections(2000)
 *             .supportEip(true)
 *             .autoRenew(false)
 *             .renewalStatus("AutoRenewal")
 *             .period(12)
 *             .instanceName(name)
 *             .supportTracing(false)
 *             .paymentType("Subscription")
 *             .renewalDurationUnit("Month")
 *             .instanceType("enterprise")
 *             .queueCapacity("200")
 *             .maxEipTps("128")
 *             .storageSize("0")
 *             .build());
 * 
 *         var default_ = new Exchange("default", ExchangeArgs.builder()
 *             .virtualHostName(virtualHostName)
 *             .instanceId(createInstance.id())
 *             .internal(true)
 *             .autoDeleteState(false)
 *             .exchangeName(name)
 *             .exchangeType("X_CONSISTENT_HASH")
 *             .alternateExchange("bakExchange")
 *             .xDelayedType("DIRECT")
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
 * RabbitMQ (AMQP) Exchange can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:amqp/exchange:Exchange example &lt;instance_id&gt;:&lt;virtual_host_name&gt;:&lt;exchange_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:amqp/exchange:Exchange")
public class Exchange extends com.pulumi.resources.CustomResource {
    /**
     * The alternate exchange. An alternate exchange is used to receive messages that fail to be routed to queues from the current exchange.
     * 
     */
    @Export(name="alternateExchange", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> alternateExchange;

    /**
     * @return The alternate exchange. An alternate exchange is used to receive messages that fail to be routed to queues from the current exchange.
     * 
     */
    public Output<Optional<String>> alternateExchange() {
        return Codegen.optional(this.alternateExchange);
    }
    /**
     * Specifies whether to automatically delete the exchange. Valid values:
     * 
     */
    @Export(name="autoDeleteState", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> autoDeleteState;

    /**
     * @return Specifies whether to automatically delete the exchange. Valid values:
     * 
     */
    public Output<Boolean> autoDeleteState() {
        return this.autoDeleteState;
    }
    /**
     * CreateTime
     * 
     */
    @Export(name="createTime", refs={Integer.class}, tree="[0]")
    private Output<Integer> createTime;

    /**
     * @return CreateTime
     * 
     */
    public Output<Integer> createTime() {
        return this.createTime;
    }
    /**
     * The name of the exchange that you want to create. The exchange name must meet the following conventions:
     * 
     * - The name must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (\_), periods (.), number signs (#), forward slashes (/), and at signs ({@literal @}).
     * - After the exchange is created, you cannot change its name. If you want to change its name, delete the exchange and create another exchange.
     * 
     */
    @Export(name="exchangeName", refs={String.class}, tree="[0]")
    private Output<String> exchangeName;

    /**
     * @return The name of the exchange that you want to create. The exchange name must meet the following conventions:
     * 
     * - The name must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (\_), periods (.), number signs (#), forward slashes (/), and at signs ({@literal @}).
     * - After the exchange is created, you cannot change its name. If you want to change its name, delete the exchange and create another exchange.
     * 
     */
    public Output<String> exchangeName() {
        return this.exchangeName;
    }
    /**
     * The Exchange type. Value:
     * - `DIRECT`: This type of Routing rule routes messages to a Queue whose Binding Key matches the Routing Key.
     * - `TOPIC`: This type is similar to the DIRECT type. It uses Routing Key pattern matching and string comparison to route messages to the bound Queue.
     * - `FANOUT`: This type of routing rule is very simple. It routes all messages sent to the Exchange to all queues bound to it, which is equivalent to the broadcast function.
     * - `HEADERS`: This type is similar to the DIRECT type. Headers Exchange uses the Headers attribute instead of Routing Key for route matching. When binding Headers Exchange and Queue, the Key-value pair of the bound attribute is set. When sending a message to Headers Exchange, the Headers attribute Key-value pair of the message is set, and the message is routed to the bound Queue by comparing the Headers attribute Key-value pair with the bound attribute Key-value pair.
     * - `X_delayed_message`: By declaring this type of Exchange, you can customize the Header attribute x-delay of the message to specify the delivery delay time period, in milliseconds. Messages will be delivered to the corresponding Queue after the time period defined in the x-delay according to the routing rules. The routing rule depends on the Exchange route type specified in the x-delayed-type.
     * - `X_CONSISTENT_HASH`: The x-consistent-hash Exchange allows you to Hash the Routing Key or Header value and use the consistent hashing algorithm to route messages to different queues.
     * 
     */
    @Export(name="exchangeType", refs={String.class}, tree="[0]")
    private Output<String> exchangeType;

    /**
     * @return The Exchange type. Value:
     * - `DIRECT`: This type of Routing rule routes messages to a Queue whose Binding Key matches the Routing Key.
     * - `TOPIC`: This type is similar to the DIRECT type. It uses Routing Key pattern matching and string comparison to route messages to the bound Queue.
     * - `FANOUT`: This type of routing rule is very simple. It routes all messages sent to the Exchange to all queues bound to it, which is equivalent to the broadcast function.
     * - `HEADERS`: This type is similar to the DIRECT type. Headers Exchange uses the Headers attribute instead of Routing Key for route matching. When binding Headers Exchange and Queue, the Key-value pair of the bound attribute is set. When sending a message to Headers Exchange, the Headers attribute Key-value pair of the message is set, and the message is routed to the bound Queue by comparing the Headers attribute Key-value pair with the bound attribute Key-value pair.
     * - `X_delayed_message`: By declaring this type of Exchange, you can customize the Header attribute x-delay of the message to specify the delivery delay time period, in milliseconds. Messages will be delivered to the corresponding Queue after the time period defined in the x-delay according to the routing rules. The routing rule depends on the Exchange route type specified in the x-delayed-type.
     * - `X_CONSISTENT_HASH`: The x-consistent-hash Exchange allows you to Hash the Routing Key or Header value and use the consistent hashing algorithm to route messages to different queues.
     * 
     */
    public Output<String> exchangeType() {
        return this.exchangeType;
    }
    /**
     * The ID of the ApsaraMQ for RabbitMQ instance whose exchange you want to delete.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return The ID of the ApsaraMQ for RabbitMQ instance whose exchange you want to delete.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * Specifies whether the exchange is an internal exchange. Valid values:
     * 
     */
    @Export(name="internal", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> internal;

    /**
     * @return Specifies whether the exchange is an internal exchange. Valid values:
     * 
     */
    public Output<Boolean> internal() {
        return this.internal;
    }
    /**
     * The name of the vhost to which the exchange that you want to create belongs.
     * 
     */
    @Export(name="virtualHostName", refs={String.class}, tree="[0]")
    private Output<String> virtualHostName;

    /**
     * @return The name of the vhost to which the exchange that you want to create belongs.
     * 
     */
    public Output<String> virtualHostName() {
        return this.virtualHostName;
    }
    /**
     * RabbitMQ supports the x-delayed-message Exchange. By declaring this type of Exchange, you can customize the x-delay header attribute to specify the delay period for message delivery, measured in milliseconds. The message will be delivered to the corresponding Queue after the period defined in x-delay. The routing rules are determined by the type of Exchange specified in x-delayed-type.
     * 
     */
    @Export(name="xDelayedType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> xDelayedType;

    /**
     * @return RabbitMQ supports the x-delayed-message Exchange. By declaring this type of Exchange, you can customize the x-delay header attribute to specify the delay period for message delivery, measured in milliseconds. The message will be delivered to the corresponding Queue after the period defined in x-delay. The routing rules are determined by the type of Exchange specified in x-delayed-type.
     * 
     */
    public Output<Optional<String>> xDelayedType() {
        return Codegen.optional(this.xDelayedType);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Exchange(java.lang.String name) {
        this(name, ExchangeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Exchange(java.lang.String name, ExchangeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Exchange(java.lang.String name, ExchangeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:amqp/exchange:Exchange", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Exchange(java.lang.String name, Output<java.lang.String> id, @Nullable ExchangeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:amqp/exchange:Exchange", name, state, makeResourceOptions(options, id), false);
    }

    private static ExchangeArgs makeArgs(ExchangeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ExchangeArgs.Empty : args;
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
    public static Exchange get(java.lang.String name, Output<java.lang.String> id, @Nullable ExchangeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Exchange(name, id, state, options);
    }
}
