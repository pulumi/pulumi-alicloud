// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Hbr
{
    /// <summary>
    /// Provides a Hybrid Backup Recovery (HBR) Hana Backup Client resource.
    /// 
    /// For information about Hybrid Backup Recovery (HBR) Hana Backup Client and how to use it, see [What is Hana Backup Client](https://www.alibabacloud.com/help/en/hybrid-backup-recovery/latest/api-doc-hbr-2017-09-08-api-doc-createclients).
    /// 
    /// &gt; **NOTE:** Available in v1.198.0+.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new AliCloud.Hbr.HanaBackupClient("default", new()
    ///     {
    ///         VaultId = data.Alicloud_hbr_vaults.Default.Vaults[0].Id,
    ///         ClientInfo = "[ { \"instanceId\": \"i-bp116lr******te9q2\", \"clusterId\": \"cl-000csy09q******9rfz9\", \"sourceTypes\": [ \"HANA\" ]  }]",
    ///         AlertSetting = "INHERITED",
    ///         UseHttps = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Hybrid Backup Recovery (HBR) Hana Backup Client can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:hbr/hanaBackupClient:HanaBackupClient example &lt;vault_id&gt;:&lt;client_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:hbr/hanaBackupClient:HanaBackupClient")]
    public partial class HanaBackupClient : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The alert settings. Valid value: `INHERITED`.
        /// </summary>
        [Output("alertSetting")]
        public Output<string> AlertSetting { get; private set; } = null!;

        /// <summary>
        /// The ID of the backup client.
        /// </summary>
        [Output("clientId")]
        public Output<string> ClientId { get; private set; } = null!;

        /// <summary>
        /// The installation information of the HBR clients.
        /// </summary>
        [Output("clientInfo")]
        public Output<string?> ClientInfo { get; private set; } = null!;

        /// <summary>
        /// The ID of the SAP HANA instance.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The ID of the instance.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// The status of the Hana Backup Client.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to transmit data over HTTPS. Valid values: `true`, `false`.
        /// </summary>
        [Output("useHttps")]
        public Output<bool?> UseHttps { get; private set; } = null!;

        /// <summary>
        /// The ID of the backup vault.
        /// </summary>
        [Output("vaultId")]
        public Output<string> VaultId { get; private set; } = null!;


        /// <summary>
        /// Create a HanaBackupClient resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public HanaBackupClient(string name, HanaBackupClientArgs args, CustomResourceOptions? options = null)
            : base("alicloud:hbr/hanaBackupClient:HanaBackupClient", name, args ?? new HanaBackupClientArgs(), MakeResourceOptions(options, ""))
        {
        }

        private HanaBackupClient(string name, Input<string> id, HanaBackupClientState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:hbr/hanaBackupClient:HanaBackupClient", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing HanaBackupClient resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static HanaBackupClient Get(string name, Input<string> id, HanaBackupClientState? state = null, CustomResourceOptions? options = null)
        {
            return new HanaBackupClient(name, id, state, options);
        }
    }

    public sealed class HanaBackupClientArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The alert settings. Valid value: `INHERITED`.
        /// </summary>
        [Input("alertSetting")]
        public Input<string>? AlertSetting { get; set; }

        /// <summary>
        /// The installation information of the HBR clients.
        /// </summary>
        [Input("clientInfo")]
        public Input<string>? ClientInfo { get; set; }

        /// <summary>
        /// Specifies whether to transmit data over HTTPS. Valid values: `true`, `false`.
        /// </summary>
        [Input("useHttps")]
        public Input<bool>? UseHttps { get; set; }

        /// <summary>
        /// The ID of the backup vault.
        /// </summary>
        [Input("vaultId", required: true)]
        public Input<string> VaultId { get; set; } = null!;

        public HanaBackupClientArgs()
        {
        }
        public static new HanaBackupClientArgs Empty => new HanaBackupClientArgs();
    }

    public sealed class HanaBackupClientState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The alert settings. Valid value: `INHERITED`.
        /// </summary>
        [Input("alertSetting")]
        public Input<string>? AlertSetting { get; set; }

        /// <summary>
        /// The ID of the backup client.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// The installation information of the HBR clients.
        /// </summary>
        [Input("clientInfo")]
        public Input<string>? ClientInfo { get; set; }

        /// <summary>
        /// The ID of the SAP HANA instance.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The ID of the instance.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// The status of the Hana Backup Client.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Specifies whether to transmit data over HTTPS. Valid values: `true`, `false`.
        /// </summary>
        [Input("useHttps")]
        public Input<bool>? UseHttps { get; set; }

        /// <summary>
        /// The ID of the backup vault.
        /// </summary>
        [Input("vaultId")]
        public Input<string>? VaultId { get; set; }

        public HanaBackupClientState()
        {
        }
        public static new HanaBackupClientState Empty => new HanaBackupClientState();
    }
}