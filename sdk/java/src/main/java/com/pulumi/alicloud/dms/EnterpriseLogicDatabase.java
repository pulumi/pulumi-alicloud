// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dms;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.dms.EnterpriseLogicDatabaseArgs;
import com.pulumi.alicloud.dms.inputs.EnterpriseLogicDatabaseState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a DMS Enterprise Logic Database resource.
 * 
 * For information about DMS Enterprise Logic Database and how to use it, see [What is Logic Database](https://www.alibabacloud.com/help/zh/data-management-service/latest/api-doc-dms-enterprise-2018-11-01-api-doc-createlogicdatabase).
 * 
 * &gt; **NOTE:** Available in v1.195.0+.
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.dms.EnterpriseLogicDatabase;
 * import com.pulumi.alicloud.dms.EnterpriseLogicDatabaseArgs;
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
 *         var default_ = new EnterpriseLogicDatabase(&#34;default&#34;, EnterpriseLogicDatabaseArgs.builder()        
 *             .alias(&#34;TF_logic_db_test&#34;)
 *             .databaseIds(            
 *                 &#34;35617919&#34;,
 *                 &#34;35617920&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * DMS Enterprise Logic Database can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:dms/enterpriseLogicDatabase:EnterpriseLogicDatabase example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:dms/enterpriseLogicDatabase:EnterpriseLogicDatabase")
public class EnterpriseLogicDatabase extends com.pulumi.resources.CustomResource {
    /**
     * Logical Library alias.
     * 
     */
    @Export(name="alias", type=String.class, parameters={})
    private Output<String> alias;

    /**
     * @return Logical Library alias.
     * 
     */
    public Output<String> alias() {
        return this.alias;
    }
    /**
     * Sub-Database ID
     * 
     */
    @Export(name="databaseIds", type=List.class, parameters={String.class})
    private Output<List<String>> databaseIds;

    /**
     * @return Sub-Database ID
     * 
     */
    public Output<List<String>> databaseIds() {
        return this.databaseIds;
    }
    /**
     * Database type.
     * 
     */
    @Export(name="dbType", type=String.class, parameters={})
    private Output<String> dbType;

    /**
     * @return Database type.
     * 
     */
    public Output<String> dbType() {
        return this.dbType;
    }
    /**
     * Environment type, return value is as follows:-product: production environment-dev: development environment-pre: Advance Environment-test: test environment-sit:SIT environment-uat:UAT environment-pet: Pressure measurement environment-stag:STAG environment
     * 
     */
    @Export(name="envType", type=String.class, parameters={})
    private Output<String> envType;

    /**
     * @return Environment type, return value is as follows:-product: production environment-dev: development environment-pre: Advance Environment-test: test environment-sit:SIT environment-uat:UAT environment-pet: Pressure measurement environment-stag:STAG environment
     * 
     */
    public Output<String> envType() {
        return this.envType;
    }
    /**
     * Whether it is a logical Library, the return value is true.
     * 
     */
    @Export(name="logic", type=Boolean.class, parameters={})
    private Output<Boolean> logic;

    /**
     * @return Whether it is a logical Library, the return value is true.
     * 
     */
    public Output<Boolean> logic() {
        return this.logic;
    }
    /**
     * The ID of the logical Library.
     * 
     */
    @Export(name="logicDatabaseId", type=String.class, parameters={})
    private Output<String> logicDatabaseId;

    /**
     * @return The ID of the logical Library.
     * 
     */
    public Output<String> logicDatabaseId() {
        return this.logicDatabaseId;
    }
    /**
     * The user ID list of the logical library Owner.
     * 
     */
    @Export(name="ownerIdLists", type=List.class, parameters={String.class})
    private Output<List<String>> ownerIdLists;

    /**
     * @return The user ID list of the logical library Owner.
     * 
     */
    public Output<List<String>> ownerIdLists() {
        return this.ownerIdLists;
    }
    /**
     * The nickname list of the logical library Owner.
     * 
     */
    @Export(name="ownerNameLists", type=List.class, parameters={String.class})
    private Output<List<String>> ownerNameLists;

    /**
     * @return The nickname list of the logical library Owner.
     * 
     */
    public Output<List<String>> ownerNameLists() {
        return this.ownerNameLists;
    }
    /**
     * Logical Library name.
     * 
     */
    @Export(name="schemaName", type=String.class, parameters={})
    private Output<String> schemaName;

    /**
     * @return Logical Library name.
     * 
     */
    public Output<String> schemaName() {
        return this.schemaName;
    }
    /**
     * Logical library search name.
     * 
     */
    @Export(name="searchName", type=String.class, parameters={})
    private Output<String> searchName;

    /**
     * @return Logical library search name.
     * 
     */
    public Output<String> searchName() {
        return this.searchName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EnterpriseLogicDatabase(String name) {
        this(name, EnterpriseLogicDatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EnterpriseLogicDatabase(String name, EnterpriseLogicDatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EnterpriseLogicDatabase(String name, EnterpriseLogicDatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dms/enterpriseLogicDatabase:EnterpriseLogicDatabase", name, args == null ? EnterpriseLogicDatabaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EnterpriseLogicDatabase(String name, Output<String> id, @Nullable EnterpriseLogicDatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dms/enterpriseLogicDatabase:EnterpriseLogicDatabase", name, state, makeResourceOptions(options, id));
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
    public static EnterpriseLogicDatabase get(String name, Output<String> id, @Nullable EnterpriseLogicDatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EnterpriseLogicDatabase(name, id, state, options);
    }
}