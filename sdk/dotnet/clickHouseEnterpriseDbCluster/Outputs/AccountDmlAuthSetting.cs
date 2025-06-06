// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.clickHouseEnterpriseDbCluster.Outputs
{

    [OutputType]
    public sealed class AccountDmlAuthSetting
    {
        /// <summary>
        /// The list of databases that require authorization. If there are more than one, separate them with commas (,).
        /// </summary>
        public readonly ImmutableArray<string> AllowDatabases;
        /// <summary>
        /// List of dictionaries that require authorization. If there are more than one, separate them with commas (,).
        /// </summary>
        public readonly ImmutableArray<string> AllowDictionaries;
        /// <summary>
        /// Whether to grant the DDL permission to the database account. Value description:
        /// </summary>
        public readonly bool DdlAuthority;
        /// <summary>
        /// Whether to grant the DML permission to the database account. The values are as follows:
        /// </summary>
        public readonly int DmlAuthority;

        [OutputConstructor]
        private AccountDmlAuthSetting(
            ImmutableArray<string> allowDatabases,

            ImmutableArray<string> allowDictionaries,

            bool ddlAuthority,

            int dmlAuthority)
        {
            AllowDatabases = allowDatabases;
            AllowDictionaries = allowDictionaries;
            DdlAuthority = ddlAuthority;
            DmlAuthority = dmlAuthority;
        }
    }
}
