// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.esa;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.esa.RecordArgs;
import com.pulumi.alicloud.esa.inputs.RecordState;
import com.pulumi.alicloud.esa.outputs.RecordAuthConf;
import com.pulumi.alicloud.esa.outputs.RecordData;
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
 * Provides a ESA Record resource.
 * 
 * For information about ESA Record and how to use it, see [What is Record](https://www.alibabacloud.com/help/en/).
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
 * import com.pulumi.alicloud.esa.RatePlanInstance;
 * import com.pulumi.alicloud.esa.RatePlanInstanceArgs;
 * import com.pulumi.alicloud.esa.Site;
 * import com.pulumi.alicloud.esa.SiteArgs;
 * import com.pulumi.alicloud.esa.Record;
 * import com.pulumi.alicloud.esa.RecordArgs;
 * import com.pulumi.alicloud.esa.inputs.RecordDataArgs;
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
 *         var default_ = new RatePlanInstance("default", RatePlanInstanceArgs.builder()
 *             .type("NS")
 *             .autoRenew("false")
 *             .period("1")
 *             .paymentType("Subscription")
 *             .coverage("overseas")
 *             .autoPay("true")
 *             .planName("high")
 *             .build());
 * 
 *         var defaultSite = new Site("defaultSite", SiteArgs.builder()
 *             .siteName("idlexamplerecord.com")
 *             .instanceId(default_.id())
 *             .coverage("overseas")
 *             .accessType("NS")
 *             .build());
 * 
 *         var defaultRecord = new Record("defaultRecord", RecordArgs.builder()
 *             .data(RecordDataArgs.builder()
 *                 .value("www.eerrraaa.com")
 *                 .weight("1")
 *                 .priority("1")
 *                 .port("80")
 *                 .build())
 *             .ttl("100")
 *             .recordName("_udp._sip.idlexamplerecord.com")
 *             .comment("This is a remark")
 *             .siteId(defaultSite.id())
 *             .recordType("SRV")
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
 * ESA Record can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:esa/record:Record example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:esa/record:Record")
public class Record extends com.pulumi.resources.CustomResource {
    /**
     * The origin authentication information of the CNAME record. See `auth_conf` below.
     * 
     */
    @Export(name="authConf", refs={RecordAuthConf.class}, tree="[0]")
    private Output</* @Nullable */ RecordAuthConf> authConf;

    /**
     * @return The origin authentication information of the CNAME record. See `auth_conf` below.
     * 
     */
    public Output<Optional<RecordAuthConf>> authConf() {
        return Codegen.optional(this.authConf);
    }
    /**
     * The business scenario of the record for acceleration. Valid values:
     * 
     */
    @Export(name="bizName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> bizName;

    /**
     * @return The business scenario of the record for acceleration. Valid values:
     * 
     */
    public Output<Optional<String>> bizName() {
        return Codegen.optional(this.bizName);
    }
    /**
     * The comments of the record.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return The comments of the record.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The creation time of the record. The date format follows ISO8601 notation and uses UTC time. The format is yyyy-MM-ddTHH:mm:ssZ.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The creation time of the record. The date format follows ISO8601 notation and uses UTC time. The format is yyyy-MM-ddTHH:mm:ssZ.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The DNS record information. The format of this field varies based on the record type. For more information, see [Add DNS records](https://www.alibabacloud.com/help/doc-detail/2708761.html). See `data` below.
     * 
     */
    @Export(name="data", refs={RecordData.class}, tree="[0]")
    private Output<RecordData> data;

    /**
     * @return The DNS record information. The format of this field varies based on the record type. For more information, see [Add DNS records](https://www.alibabacloud.com/help/doc-detail/2708761.html). See `data` below.
     * 
     */
    public Output<RecordData> data() {
        return this.data;
    }
    /**
     * The origin host policy. This policy takes effect when the record type is CNAME. You can set the policy in two modes:
     * 
     */
    @Export(name="hostPolicy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> hostPolicy;

    /**
     * @return The origin host policy. This policy takes effect when the record type is CNAME. You can set the policy in two modes:
     * 
     */
    public Output<Optional<String>> hostPolicy() {
        return Codegen.optional(this.hostPolicy);
    }
    /**
     * Filters by whether the record is proxied. Valid values:
     * 
     */
    @Export(name="proxied", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> proxied;

    /**
     * @return Filters by whether the record is proxied. Valid values:
     * 
     */
    public Output<Optional<Boolean>> proxied() {
        return Codegen.optional(this.proxied);
    }
    /**
     * The record name. This parameter specifies a filter condition for the query.
     * 
     */
    @Export(name="recordName", refs={String.class}, tree="[0]")
    private Output<String> recordName;

    /**
     * @return The record name. This parameter specifies a filter condition for the query.
     * 
     */
    public Output<String> recordName() {
        return this.recordName;
    }
    /**
     * The DNS record type.
     * 
     */
    @Export(name="recordType", refs={String.class}, tree="[0]")
    private Output<String> recordType;

    /**
     * @return The DNS record type.
     * 
     */
    public Output<String> recordType() {
        return this.recordType;
    }
    /**
     * The website ID, which can be obtained by calling the [ListSites](https://www.alibabacloud.com/help/en/doc-detail/2850189.html) operation.
     * 
     */
    @Export(name="siteId", refs={Integer.class}, tree="[0]")
    private Output<Integer> siteId;

    /**
     * @return The website ID, which can be obtained by calling the [ListSites](https://www.alibabacloud.com/help/en/doc-detail/2850189.html) operation.
     * 
     */
    public Output<Integer> siteId() {
        return this.siteId;
    }
    /**
     * The origin type of the record. Only CNAME records can be filtered by using this field. Valid values:
     * 
     * - `OSS`: OSS bucket.
     * - `S3`: S3 bucket.
     * - `LB`: load balancer.
     * - `OP`: origin pool.
     * - `Domain`: domain name.
     * 
     */
    @Export(name="sourceType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sourceType;

    /**
     * @return The origin type of the record. Only CNAME records can be filtered by using this field. Valid values:
     * 
     * - `OSS`: OSS bucket.
     * - `S3`: S3 bucket.
     * - `LB`: load balancer.
     * - `OP`: origin pool.
     * - `Domain`: domain name.
     * 
     */
    public Output<Optional<String>> sourceType() {
        return Codegen.optional(this.sourceType);
    }
    /**
     * The TTL of the record. Unit: seconds. The range is 30 to 86,400, or 1. If the value is 1, the TTL of the record is determined by the system.
     * 
     */
    @Export(name="ttl", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> ttl;

    /**
     * @return The TTL of the record. Unit: seconds. The range is 30 to 86,400, or 1. If the value is 1, the TTL of the record is determined by the system.
     * 
     */
    public Output<Optional<Integer>> ttl() {
        return Codegen.optional(this.ttl);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Record(java.lang.String name) {
        this(name, RecordArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Record(java.lang.String name, RecordArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Record(java.lang.String name, RecordArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:esa/record:Record", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Record(java.lang.String name, Output<java.lang.String> id, @Nullable RecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:esa/record:Record", name, state, makeResourceOptions(options, id), false);
    }

    private static RecordArgs makeArgs(RecordArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RecordArgs.Empty : args;
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
    public static Record get(java.lang.String name, Output<java.lang.String> id, @Nullable RecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Record(name, id, state, options);
    }
}