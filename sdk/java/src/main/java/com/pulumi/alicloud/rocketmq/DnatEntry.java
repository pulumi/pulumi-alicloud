// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rocketmq;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.rocketmq.DnatEntryArgs;
import com.pulumi.alicloud.rocketmq.inputs.DnatEntryState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Sag DnatEntry resource. This topic describes how to add a DNAT entry to a Smart Access Gateway (SAG) instance to enable the DNAT function. By using the DNAT function, you can forward requests received by public IP addresses to Alibaba Cloud instances according to custom mapping rules.
 * 
 * For information about Sag DnatEntry and how to use it, see [What is Sag DnatEntry](https://www.alibabacloud.com/help/en/smart-access-gateway/latest/adddnatentry).
 * 
 * &gt; **NOTE:** Available since v1.63.0.
 * 
 * &gt; **NOTE:** Only the following regions suppor. [`cn-shanghai`, `cn-shanghai-finance-1`, `cn-hongkong`, `ap-southeast-1`, `ap-southeast-3`, `ap-southeast-5`, `ap-northeast-1`, `eu-central-1`]
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
 * import com.pulumi.alicloud.sag.DnatEntry;
 * import com.pulumi.alicloud.sag.DnatEntryArgs;
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
 *         final var sagId = config.get("sagId").orElse("sag-9bifkfaz***");
 *         var default_ = new DnatEntry("default", DnatEntryArgs.builder()
 *             .sagId(sagId)
 *             .type("Intranet")
 *             .ipProtocol("any")
 *             .externalIp("172.32.0.2")
 *             .externalPort("any")
 *             .internalIp("172.16.0.4")
 *             .internalPort("any")
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
 * The Sag DnatEntry can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:rocketmq/dnatEntry:DnatEntry example sag-abc123456:dnat-abc123456
 * ```
 * 
 * @deprecated
 * alicloud.rocketmq/dnatentry.DnatEntry has been deprecated in favor of alicloud.sag/dnatentry.DnatEntry
 * 
 */
@Deprecated /* alicloud.rocketmq/dnatentry.DnatEntry has been deprecated in favor of alicloud.sag/dnatentry.DnatEntry */
@ResourceType(type="alicloud:rocketmq/dnatEntry:DnatEntry")
public class DnatEntry extends com.pulumi.resources.CustomResource {
    /**
     * The external public IP address.when &#34;type&#34; is &#34;Internet&#34;,automatically identify the external ip.
     * 
     */
    @Export(name="externalIp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> externalIp;

    /**
     * @return The external public IP address.when &#34;type&#34; is &#34;Internet&#34;,automatically identify the external ip.
     * 
     */
    public Output<Optional<String>> externalIp() {
        return Codegen.optional(this.externalIp);
    }
    /**
     * The public port.Value range: 1 to 65535 or &#34;any&#34;.
     * 
     */
    @Export(name="externalPort", refs={String.class}, tree="[0]")
    private Output<String> externalPort;

    /**
     * @return The public port.Value range: 1 to 65535 or &#34;any&#34;.
     * 
     */
    public Output<String> externalPort() {
        return this.externalPort;
    }
    /**
     * The destination private IP address.
     * 
     */
    @Export(name="internalIp", refs={String.class}, tree="[0]")
    private Output<String> internalIp;

    /**
     * @return The destination private IP address.
     * 
     */
    public Output<String> internalIp() {
        return this.internalIp;
    }
    /**
     * The destination private port.Value range: 1 to 65535 or &#34;any&#34;.
     * 
     */
    @Export(name="internalPort", refs={String.class}, tree="[0]")
    private Output<String> internalPort;

    /**
     * @return The destination private port.Value range: 1 to 65535 or &#34;any&#34;.
     * 
     */
    public Output<String> internalPort() {
        return this.internalPort;
    }
    /**
     * The protocol type. Valid values: TCP: Forwards packets of the TCP protocol. UDP: Forwards packets of the UDP protocol. Any: Forwards packets of all protocols.
     * 
     */
    @Export(name="ipProtocol", refs={String.class}, tree="[0]")
    private Output<String> ipProtocol;

    /**
     * @return The protocol type. Valid values: TCP: Forwards packets of the TCP protocol. UDP: Forwards packets of the UDP protocol. Any: Forwards packets of all protocols.
     * 
     */
    public Output<String> ipProtocol() {
        return this.ipProtocol;
    }
    /**
     * The ID of the SAG instance.
     * 
     */
    @Export(name="sagId", refs={String.class}, tree="[0]")
    private Output<String> sagId;

    /**
     * @return The ID of the SAG instance.
     * 
     */
    public Output<String> sagId() {
        return this.sagId;
    }
    /**
     * The DNAT type. Valid values: Intranet: DNAT of private IP addresses. Internet: DNAT of public IP addresses
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The DNAT type. Valid values: Intranet: DNAT of private IP addresses. Internet: DNAT of public IP addresses
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DnatEntry(java.lang.String name) {
        this(name, DnatEntryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DnatEntry(java.lang.String name, DnatEntryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DnatEntry(java.lang.String name, DnatEntryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:rocketmq/dnatEntry:DnatEntry", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DnatEntry(java.lang.String name, Output<java.lang.String> id, @Nullable DnatEntryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:rocketmq/dnatEntry:DnatEntry", name, state, makeResourceOptions(options, id), false);
    }

    private static DnatEntryArgs makeArgs(DnatEntryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DnatEntryArgs.Empty : args;
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
    public static DnatEntry get(java.lang.String name, Output<java.lang.String> id, @Nullable DnatEntryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DnatEntry(name, id, state, options);
    }
}
