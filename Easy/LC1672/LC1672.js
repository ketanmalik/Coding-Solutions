/**
 * @param {number[][]} accounts
 * @return {number}
 */
const maximumWealth = accounts => (
    Math.max(...accounts.map(account =>
                account.reduce((sum, curr) => sum += curr), 0))
);