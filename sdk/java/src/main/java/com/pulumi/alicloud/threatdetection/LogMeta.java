// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.threatdetection;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.threatdetection.LogMetaArgs;
import com.pulumi.alicloud.threatdetection.inputs.LogMetaState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Threat Detection Log Meta can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:threatdetection/logMeta:LogMeta example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:threatdetection/logMeta:LogMeta")
public class LogMeta extends com.pulumi.resources.CustomResource {
    /**
     * The name of the exclusive Logstore where logs are stored. Value:
     * - aegis-log-client: client event log
     * - aegis-log-crack: Brute Force log
     * - aegis-log-dns-query:DNS request log
     * - aegis-log-login: login log
     * - aegis-log-network: network connection log
     * - aegis-log-process: process startup log
     * - aegis-snapshot-host: account snapshot log
     * - aegis-snapshot-port: port snapshot log
     * - aegis-snapshot-process: process snapshot log
     * - local-dns: local DNS log
     * - sas-log-dns:DNS resolution log
     * - sas-log-http:WEB access log
     * - sas-log-session: Web session log
     * - sas-security-log: alarm log
     * - sas-vul-log: Vulnerability log
     * - sas-cspm-log: Cloud platform configuration check log
     * - sas-hc-log: baseline log
     * - sas-rasp-log: Application Protection Log
     * - sas-filedetect-log: file detection log
     * - sas-net-block: Network Defense Log
     * 
     */
    @Export(name="logMetaName", refs={String.class}, tree="[0]")
    private Output<String> logMetaName;

    /**
     * @return The name of the exclusive Logstore where logs are stored. Value:
     * - aegis-log-client: client event log
     * - aegis-log-crack: Brute Force log
     * - aegis-log-dns-query:DNS request log
     * - aegis-log-login: login log
     * - aegis-log-network: network connection log
     * - aegis-log-process: process startup log
     * - aegis-snapshot-host: account snapshot log
     * - aegis-snapshot-port: port snapshot log
     * - aegis-snapshot-process: process snapshot log
     * - local-dns: local DNS log
     * - sas-log-dns:DNS resolution log
     * - sas-log-http:WEB access log
     * - sas-log-session: Web session log
     * - sas-security-log: alarm log
     * - sas-vul-log: Vulnerability log
     * - sas-cspm-log: Cloud platform configuration check log
     * - sas-hc-log: baseline log
     * - sas-rasp-log: Application Protection Log
     * - sas-filedetect-log: file detection log
     * - sas-net-block: Network Defense Log
     * 
     */
    public Output<String> logMetaName() {
        return this.logMetaName;
    }
    /**
     * The status of the resource
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogMeta(java.lang.String name) {
        this(name, LogMetaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogMeta(java.lang.String name, LogMetaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogMeta(java.lang.String name, LogMetaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:threatdetection/logMeta:LogMeta", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private LogMeta(java.lang.String name, Output<java.lang.String> id, @Nullable LogMetaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:threatdetection/logMeta:LogMeta", name, state, makeResourceOptions(options, id), false);
    }

    private static LogMetaArgs makeArgs(LogMetaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LogMetaArgs.Empty : args;
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
    public static LogMeta get(java.lang.String name, Output<java.lang.String> id, @Nullable LogMetaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogMeta(name, id, state, options);
    }
}
