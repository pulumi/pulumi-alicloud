// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpn.CustomerGatewayArgs;
import com.pulumi.alicloud.vpn.inputs.CustomerGatewayState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
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
 * import com.pulumi.alicloud.vpn.CustomerGateway;
 * import com.pulumi.alicloud.vpn.CustomerGatewayArgs;
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
 *         var default_ = new CustomerGateway("default", CustomerGatewayArgs.builder()
 *             .description(name)
 *             .ipAddress("4.3.2.10")
 *             .asn("1219002")
 *             .customerGatewayName(name)
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
 * VPN customer gateway can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:vpn/customerGateway:CustomerGateway example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:vpn/customerGateway:CustomerGateway")
public class CustomerGateway extends com.pulumi.resources.CustomResource {
    /**
     * Asn.
     * 
     */
    @Export(name="asn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> asn;

    /**
     * @return Asn.
     * 
     */
    public Output<Optional<String>> asn() {
        return Codegen.optional(this.asn);
    }
    /**
     * The time when the customer gateway was created.
     * 
     */
    @Export(name="createTime", refs={Integer.class}, tree="[0]")
    private Output<Integer> createTime;

    /**
     * @return The time when the customer gateway was created.
     * 
     */
    public Output<Integer> createTime() {
        return this.createTime;
    }
    /**
     * The name of the customer gateway.
     * 
     */
    @Export(name="customerGatewayName", refs={String.class}, tree="[0]")
    private Output<String> customerGatewayName;

    /**
     * @return The name of the customer gateway.
     * 
     */
    public Output<String> customerGatewayName() {
        return this.customerGatewayName;
    }
    /**
     * The description of the customer gateway.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the customer gateway.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The IP address of the customer gateway.
     * 
     */
    @Export(name="ipAddress", refs={String.class}, tree="[0]")
    private Output<String> ipAddress;

    /**
     * @return The IP address of the customer gateway.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }
    /**
     * . Field &#39;name&#39; has been deprecated from provider version 1.216.0. New field &#39;customer_gateway_name&#39; instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated since provider version 1.210.0. New field &#39;customer_gateway_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated since provider version 1.210.0. New field 'customer_gateway_name' instead. */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return . Field &#39;name&#39; has been deprecated from provider version 1.216.0. New field &#39;customer_gateway_name&#39; instead.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * tag.
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return tag.
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomerGateway(java.lang.String name) {
        this(name, CustomerGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomerGateway(java.lang.String name, CustomerGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomerGateway(java.lang.String name, CustomerGatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpn/customerGateway:CustomerGateway", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CustomerGateway(java.lang.String name, Output<java.lang.String> id, @Nullable CustomerGatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpn/customerGateway:CustomerGateway", name, state, makeResourceOptions(options, id), false);
    }

    private static CustomerGatewayArgs makeArgs(CustomerGatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CustomerGatewayArgs.Empty : args;
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
    public static CustomerGateway get(java.lang.String name, Output<java.lang.String> id, @Nullable CustomerGatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomerGateway(name, id, state, options);
    }
}
