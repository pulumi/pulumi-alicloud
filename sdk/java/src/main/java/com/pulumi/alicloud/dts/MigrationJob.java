// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dts;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.dts.MigrationJobArgs;
import com.pulumi.alicloud.dts.inputs.MigrationJobState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DTS Migration Job resource.
 * 
 * For information about DTS Migration Job and how to use it, see [What is Migration Job](https://www.alibabacloud.com/help/en/doc-detail/208399.html).
 * 
 * &gt; **NOTE:** Available since v1.157.0.
 * 
 * ## Import
 * 
 * DTS Migration Job can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:dts/migrationJob:MigrationJob example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:dts/migrationJob:MigrationJob")
public class MigrationJob extends com.pulumi.resources.CustomResource {
    /**
     * Start time in Unix timestamp format.
     * 
     */
    @Export(name="checkpoint", refs={String.class}, tree="[0]")
    private Output<String> checkpoint;

    /**
     * @return Start time in Unix timestamp format.
     * 
     */
    public Output<String> checkpoint() {
        return this.checkpoint;
    }
    /**
     * Whether to execute DTS supports schema migration.
     * 
     */
    @Export(name="dataInitialization", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> dataInitialization;

    /**
     * @return Whether to execute DTS supports schema migration.
     * 
     */
    public Output<Boolean> dataInitialization() {
        return this.dataInitialization;
    }
    /**
     * Whether to perform incremental data migration.
     * 
     */
    @Export(name="dataSynchronization", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> dataSynchronization;

    /**
     * @return Whether to perform incremental data migration.
     * 
     */
    public Output<Boolean> dataSynchronization() {
        return this.dataSynchronization;
    }
    /**
     * Migration object, in the format of JSON strings. For detailed definition instructions, please refer to [the description of migration, migration or subscription objects](https://help.aliyun.com/document_detail/209545.html).
     * 
     */
    @Export(name="dbList", refs={String.class}, tree="[0]")
    private Output<String> dbList;

    /**
     * @return Migration object, in the format of JSON strings. For detailed definition instructions, please refer to [the description of migration, migration or subscription objects](https://help.aliyun.com/document_detail/209545.html).
     * 
     */
    public Output<String> dbList() {
        return this.dbList;
    }
    /**
     * The name of migrate the database.
     * 
     */
    @Export(name="destinationEndpointDatabaseName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> destinationEndpointDatabaseName;

    /**
     * @return The name of migrate the database.
     * 
     */
    public Output<Optional<String>> destinationEndpointDatabaseName() {
        return Codegen.optional(this.destinationEndpointDatabaseName);
    }
    /**
     * The type of destination database. Valid values: `ADS`, `ADB30`, `AS400`, `DATAHUB`, `DB2`, `GREENPLUM`, `KAFKA`, `MONGODB`, `MSSQL`, `MySQL`, `ORACLE`, `PolarDB`, `POLARDBX20`, `POLARDB_O`, `PostgreSQL`.
     * 
     */
    @Export(name="destinationEndpointEngineName", refs={String.class}, tree="[0]")
    private Output<String> destinationEndpointEngineName;

    /**
     * @return The type of destination database. Valid values: `ADS`, `ADB30`, `AS400`, `DATAHUB`, `DB2`, `GREENPLUM`, `KAFKA`, `MONGODB`, `MSSQL`, `MySQL`, `ORACLE`, `PolarDB`, `POLARDBX20`, `POLARDB_O`, `PostgreSQL`.
     * 
     */
    public Output<String> destinationEndpointEngineName() {
        return this.destinationEndpointEngineName;
    }
    /**
     * The ID of destination instance.
     * 
     */
    @Export(name="destinationEndpointInstanceId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> destinationEndpointInstanceId;

    /**
     * @return The ID of destination instance.
     * 
     */
    public Output<Optional<String>> destinationEndpointInstanceId() {
        return Codegen.optional(this.destinationEndpointInstanceId);
    }
    /**
     * The type of destination instance. Valid values: `ADS`, `CEN`, `DATAHUB`, `DG`, `ECS`, `EXPRESS`, `GREENPLUM`, `MONGODB`, `OTHER`, `PolarDB`, `POLARDBX20`, `RDS`.
     * 
     */
    @Export(name="destinationEndpointInstanceType", refs={String.class}, tree="[0]")
    private Output<String> destinationEndpointInstanceType;

    /**
     * @return The type of destination instance. Valid values: `ADS`, `CEN`, `DATAHUB`, `DG`, `ECS`, `EXPRESS`, `GREENPLUM`, `MONGODB`, `OTHER`, `PolarDB`, `POLARDBX20`, `RDS`.
     * 
     */
    public Output<String> destinationEndpointInstanceType() {
        return this.destinationEndpointInstanceType;
    }
    /**
     * The ip of source endpoint.
     * 
     */
    @Export(name="destinationEndpointIp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> destinationEndpointIp;

    /**
     * @return The ip of source endpoint.
     * 
     */
    public Output<Optional<String>> destinationEndpointIp() {
        return Codegen.optional(this.destinationEndpointIp);
    }
    /**
     * The SID of Oracle database.
     * 
     */
    @Export(name="destinationEndpointOracleSid", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> destinationEndpointOracleSid;

    /**
     * @return The SID of Oracle database.
     * 
     */
    public Output<Optional<String>> destinationEndpointOracleSid() {
        return Codegen.optional(this.destinationEndpointOracleSid);
    }
    /**
     * The password of database account.
     * 
     */
    @Export(name="destinationEndpointPassword", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> destinationEndpointPassword;

    /**
     * @return The password of database account.
     * 
     */
    public Output<Optional<String>> destinationEndpointPassword() {
        return Codegen.optional(this.destinationEndpointPassword);
    }
    /**
     * The port of source endpoint.
     * 
     */
    @Export(name="destinationEndpointPort", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> destinationEndpointPort;

    /**
     * @return The port of source endpoint.
     * 
     */
    public Output<Optional<String>> destinationEndpointPort() {
        return Codegen.optional(this.destinationEndpointPort);
    }
    /**
     * The region of destination instance.
     * 
     */
    @Export(name="destinationEndpointRegion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> destinationEndpointRegion;

    /**
     * @return The region of destination instance.
     * 
     */
    public Output<Optional<String>> destinationEndpointRegion() {
        return Codegen.optional(this.destinationEndpointRegion);
    }
    /**
     * The username of database account.
     * 
     */
    @Export(name="destinationEndpointUserName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> destinationEndpointUserName;

    /**
     * @return The username of database account.
     * 
     */
    public Output<Optional<String>> destinationEndpointUserName() {
        return Codegen.optional(this.destinationEndpointUserName);
    }
    /**
     * The Migration instance ID. The ID of `alicloud.dts.MigrationInstance`.
     * 
     */
    @Export(name="dtsInstanceId", refs={String.class}, tree="[0]")
    private Output<String> dtsInstanceId;

    /**
     * @return The Migration instance ID. The ID of `alicloud.dts.MigrationInstance`.
     * 
     */
    public Output<String> dtsInstanceId() {
        return this.dtsInstanceId;
    }
    /**
     * The name of migration job.
     * 
     */
    @Export(name="dtsJobName", refs={String.class}, tree="[0]")
    private Output<String> dtsJobName;

    /**
     * @return The name of migration job.
     * 
     */
    public Output<String> dtsJobName() {
        return this.dtsJobName;
    }
    /**
     * The instance class. Valid values: `large`, `medium`, `micro`, `small`, `xlarge`, `xxlarge`.
     * 
     */
    @Export(name="instanceClass", refs={String.class}, tree="[0]")
    private Output<String> instanceClass;

    /**
     * @return The instance class. Valid values: `large`, `medium`, `micro`, `small`, `xlarge`, `xxlarge`.
     * 
     */
    public Output<String> instanceClass() {
        return this.instanceClass;
    }
    /**
     * The name of migrate the database.
     * 
     */
    @Export(name="sourceEndpointDatabaseName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sourceEndpointDatabaseName;

    /**
     * @return The name of migrate the database.
     * 
     */
    public Output<Optional<String>> sourceEndpointDatabaseName() {
        return Codegen.optional(this.sourceEndpointDatabaseName);
    }
    /**
     * The type of source database. Valid values: `AS400`, `DB2`, `DMSPOLARDB`, `HBASE`, `MONGODB`, `MSSQL`, `MySQL`, `ORACLE`, `PolarDB`, `POLARDBX20`, `POLARDB_O`, `POSTGRESQL`, `TERADATA`.
     * 
     */
    @Export(name="sourceEndpointEngineName", refs={String.class}, tree="[0]")
    private Output<String> sourceEndpointEngineName;

    /**
     * @return The type of source database. Valid values: `AS400`, `DB2`, `DMSPOLARDB`, `HBASE`, `MONGODB`, `MSSQL`, `MySQL`, `ORACLE`, `PolarDB`, `POLARDBX20`, `POLARDB_O`, `POSTGRESQL`, `TERADATA`.
     * 
     */
    public Output<String> sourceEndpointEngineName() {
        return this.sourceEndpointEngineName;
    }
    /**
     * The ID of source instance.
     * 
     */
    @Export(name="sourceEndpointInstanceId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sourceEndpointInstanceId;

    /**
     * @return The ID of source instance.
     * 
     */
    public Output<Optional<String>> sourceEndpointInstanceId() {
        return Codegen.optional(this.sourceEndpointInstanceId);
    }
    /**
     * The type of source instance. Valid values: `CEN`, `DG`, `DISTRIBUTED_DMSLOGICDB`, `ECS`, `EXPRESS`, `MONGODB`, `OTHER`, `PolarDB`, `POLARDBX20`, `RDS`.
     * 
     */
    @Export(name="sourceEndpointInstanceType", refs={String.class}, tree="[0]")
    private Output<String> sourceEndpointInstanceType;

    /**
     * @return The type of source instance. Valid values: `CEN`, `DG`, `DISTRIBUTED_DMSLOGICDB`, `ECS`, `EXPRESS`, `MONGODB`, `OTHER`, `PolarDB`, `POLARDBX20`, `RDS`.
     * 
     */
    public Output<String> sourceEndpointInstanceType() {
        return this.sourceEndpointInstanceType;
    }
    /**
     * The ip of source endpoint.
     * 
     */
    @Export(name="sourceEndpointIp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sourceEndpointIp;

    /**
     * @return The ip of source endpoint.
     * 
     */
    public Output<Optional<String>> sourceEndpointIp() {
        return Codegen.optional(this.sourceEndpointIp);
    }
    /**
     * The SID of Oracle database.
     * 
     */
    @Export(name="sourceEndpointOracleSid", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sourceEndpointOracleSid;

    /**
     * @return The SID of Oracle database.
     * 
     */
    public Output<Optional<String>> sourceEndpointOracleSid() {
        return Codegen.optional(this.sourceEndpointOracleSid);
    }
    /**
     * The Alibaba Cloud account ID to which the source instance belongs.
     * 
     */
    @Export(name="sourceEndpointOwnerId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sourceEndpointOwnerId;

    /**
     * @return The Alibaba Cloud account ID to which the source instance belongs.
     * 
     */
    public Output<Optional<String>> sourceEndpointOwnerId() {
        return Codegen.optional(this.sourceEndpointOwnerId);
    }
    /**
     * The password of database account.
     * 
     */
    @Export(name="sourceEndpointPassword", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sourceEndpointPassword;

    /**
     * @return The password of database account.
     * 
     */
    public Output<Optional<String>> sourceEndpointPassword() {
        return Codegen.optional(this.sourceEndpointPassword);
    }
    /**
     * The port of source endpoint.
     * 
     */
    @Export(name="sourceEndpointPort", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sourceEndpointPort;

    /**
     * @return The port of source endpoint.
     * 
     */
    public Output<Optional<String>> sourceEndpointPort() {
        return Codegen.optional(this.sourceEndpointPort);
    }
    /**
     * The region of source instance.
     * 
     */
    @Export(name="sourceEndpointRegion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sourceEndpointRegion;

    /**
     * @return The region of source instance.
     * 
     */
    public Output<Optional<String>> sourceEndpointRegion() {
        return Codegen.optional(this.sourceEndpointRegion);
    }
    /**
     * The name of the role configured for the cloud account to which the source instance belongs.
     * 
     */
    @Export(name="sourceEndpointRole", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sourceEndpointRole;

    /**
     * @return The name of the role configured for the cloud account to which the source instance belongs.
     * 
     */
    public Output<Optional<String>> sourceEndpointRole() {
        return Codegen.optional(this.sourceEndpointRole);
    }
    /**
     * The username of database account.
     * 
     */
    @Export(name="sourceEndpointUserName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sourceEndpointUserName;

    /**
     * @return The username of database account.
     * 
     */
    public Output<Optional<String>> sourceEndpointUserName() {
        return Codegen.optional(this.sourceEndpointUserName);
    }
    /**
     * The status of the resource. Valid values: `Migrating`, `Suspending`. You can suspend the task by specifying `Suspending` and start the task by specifying `Migrating`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource. Valid values: `Migrating`, `Suspending`. You can suspend the task by specifying `Suspending` and start the task by specifying `Migrating`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Whether to perform a database table structure to migrate.
     * 
     */
    @Export(name="structureInitialization", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> structureInitialization;

    /**
     * @return Whether to perform a database table structure to migrate.
     * 
     */
    public Output<Boolean> structureInitialization() {
        return this.structureInitialization;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MigrationJob(java.lang.String name) {
        this(name, MigrationJobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MigrationJob(java.lang.String name, MigrationJobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MigrationJob(java.lang.String name, MigrationJobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dts/migrationJob:MigrationJob", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private MigrationJob(java.lang.String name, Output<java.lang.String> id, @Nullable MigrationJobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dts/migrationJob:MigrationJob", name, state, makeResourceOptions(options, id), false);
    }

    private static MigrationJobArgs makeArgs(MigrationJobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? MigrationJobArgs.Empty : args;
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
    public static MigrationJob get(java.lang.String name, Output<java.lang.String> id, @Nullable MigrationJobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MigrationJob(name, id, state, options);
    }
}
