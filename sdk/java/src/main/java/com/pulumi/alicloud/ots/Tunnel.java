// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ots;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ots.TunnelArgs;
import com.pulumi.alicloud.ots.inputs.TunnelState;
import com.pulumi.alicloud.ots.outputs.TunnelChannel;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides an OTS tunnel resource.
 * 
 * For information about OTS tunnel and how to use it, see [Tunnel overview](https://www.alibabacloud.com/help/en/tablestore/latest/tunnel-service-overview).
 * 
 * &gt; **NOTE:** Available since v1.172.0.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.random.integer;
 * import com.pulumi.random.integerArgs;
 * import com.pulumi.alicloud.ots.Instance;
 * import com.pulumi.alicloud.ots.InstanceArgs;
 * import com.pulumi.alicloud.ots.Table;
 * import com.pulumi.alicloud.ots.TableArgs;
 * import com.pulumi.alicloud.ots.inputs.TablePrimaryKeyArgs;
 * import com.pulumi.alicloud.ots.Tunnel;
 * import com.pulumi.alicloud.ots.TunnelArgs;
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
 *         var default_ = new Integer("default", IntegerArgs.builder()
 *             .min(10000)
 *             .max(99999)
 *             .build());
 * 
 *         var defaultInstance = new Instance("defaultInstance", InstanceArgs.builder()
 *             .name(String.format("%s-%s", name,default_.result()))
 *             .description(name)
 *             .accessedBy("Any")
 *             .tags(Map.ofEntries(
 *                 Map.entry("Created", "TF"),
 *                 Map.entry("For", "example")
 *             ))
 *             .build());
 * 
 *         var defaultTable = new Table("defaultTable", TableArgs.builder()
 *             .instanceName(defaultInstance.name())
 *             .tableName("tf_example")
 *             .timeToLive(-1)
 *             .maxVersion(1)
 *             .enableSse(true)
 *             .sseKeyType("SSE_KMS_SERVICE")
 *             .primaryKeys(            
 *                 TablePrimaryKeyArgs.builder()
 *                     .name("pk1")
 *                     .type("Integer")
 *                     .build(),
 *                 TablePrimaryKeyArgs.builder()
 *                     .name("pk2")
 *                     .type("String")
 *                     .build(),
 *                 TablePrimaryKeyArgs.builder()
 *                     .name("pk3")
 *                     .type("Binary")
 *                     .build())
 *             .build());
 * 
 *         var defaultTunnel = new Tunnel("defaultTunnel", TunnelArgs.builder()
 *             .instanceName(defaultInstance.name())
 *             .tableName(defaultTable.tableName())
 *             .tunnelName("tf_example")
 *             .tunnelType("BaseAndStream")
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
 * OTS tunnel can be imported using id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ots/tunnel:Tunnel foo &lt;instance_name&gt;:&lt;table_name&gt;:&lt;tunnel_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ots/tunnel:Tunnel")
public class Tunnel extends com.pulumi.resources.CustomResource {
    /**
     * The channels of OTS tunnel. Each element contains the following attributes:
     * 
     */
    @Export(name="channels", refs={List.class,TunnelChannel.class}, tree="[0,1]")
    private Output<List<TunnelChannel>> channels;

    /**
     * @return The channels of OTS tunnel. Each element contains the following attributes:
     * 
     */
    public Output<List<TunnelChannel>> channels() {
        return this.channels;
    }
    /**
     * The creation time of the Tunnel.
     * 
     */
    @Export(name="createTime", refs={Integer.class}, tree="[0]")
    private Output<Integer> createTime;

    /**
     * @return The creation time of the Tunnel.
     * 
     */
    public Output<Integer> createTime() {
        return this.createTime;
    }
    /**
     * Whether the tunnel has expired.
     * 
     */
    @Export(name="expired", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> expired;

    /**
     * @return Whether the tunnel has expired.
     * 
     */
    public Output<Boolean> expired() {
        return this.expired;
    }
    /**
     * The name of the OTS instance in which table will located.
     * 
     */
    @Export(name="instanceName", refs={String.class}, tree="[0]")
    private Output<String> instanceName;

    /**
     * @return The name of the OTS instance in which table will located.
     * 
     */
    public Output<String> instanceName() {
        return this.instanceName;
    }
    /**
     * The name of the OTS table. If changed, a new table would be created.
     * 
     */
    @Export(name="tableName", refs={String.class}, tree="[0]")
    private Output<String> tableName;

    /**
     * @return The name of the OTS table. If changed, a new table would be created.
     * 
     */
    public Output<String> tableName() {
        return this.tableName;
    }
    /**
     * The tunnel id of the OTS which could not be changed.
     * 
     */
    @Export(name="tunnelId", refs={String.class}, tree="[0]")
    private Output<String> tunnelId;

    /**
     * @return The tunnel id of the OTS which could not be changed.
     * 
     */
    public Output<String> tunnelId() {
        return this.tunnelId;
    }
    /**
     * The name of the OTS tunnel. If changed, a new tunnel would be created.
     * 
     */
    @Export(name="tunnelName", refs={String.class}, tree="[0]")
    private Output<String> tunnelName;

    /**
     * @return The name of the OTS tunnel. If changed, a new tunnel would be created.
     * 
     */
    public Output<String> tunnelName() {
        return this.tunnelName;
    }
    /**
     * The latest consumption time of the tunnel, unix time in nanosecond.
     * 
     */
    @Export(name="tunnelRpo", refs={Integer.class}, tree="[0]")
    private Output<Integer> tunnelRpo;

    /**
     * @return The latest consumption time of the tunnel, unix time in nanosecond.
     * 
     */
    public Output<Integer> tunnelRpo() {
        return this.tunnelRpo;
    }
    /**
     * The stage of OTS tunnel, valid values: `InitBaseDataAndStreamShard`, `ProcessBaseData`, `ProcessStream`.
     * 
     */
    @Export(name="tunnelStage", refs={String.class}, tree="[0]")
    private Output<String> tunnelStage;

    /**
     * @return The stage of OTS tunnel, valid values: `InitBaseDataAndStreamShard`, `ProcessBaseData`, `ProcessStream`.
     * 
     */
    public Output<String> tunnelStage() {
        return this.tunnelStage;
    }
    /**
     * The type of the OTS tunnel. Only `BaseAndStream`, `BaseData` or `Stream` is allowed.
     * 
     */
    @Export(name="tunnelType", refs={String.class}, tree="[0]")
    private Output<String> tunnelType;

    /**
     * @return The type of the OTS tunnel. Only `BaseAndStream`, `BaseData` or `Stream` is allowed.
     * 
     */
    public Output<String> tunnelType() {
        return this.tunnelType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Tunnel(java.lang.String name) {
        this(name, TunnelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Tunnel(java.lang.String name, TunnelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Tunnel(java.lang.String name, TunnelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ots/tunnel:Tunnel", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Tunnel(java.lang.String name, Output<java.lang.String> id, @Nullable TunnelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ots/tunnel:Tunnel", name, state, makeResourceOptions(options, id), false);
    }

    private static TunnelArgs makeArgs(TunnelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TunnelArgs.Empty : args;
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
    public static Tunnel get(java.lang.String name, Output<java.lang.String> id, @Nullable TunnelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Tunnel(name, id, state, options);
    }
}
